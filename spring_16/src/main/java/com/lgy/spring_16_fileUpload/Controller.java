package com.lgy.spring_16_fileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.management.openmbean.ArrayType;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lgy.spring_16_fileUpload.domain.AttachFileDTO;

import lombok.extern.slf4j.Slf4j;
import net.coobird.thumbnailator.Thumbnailator;

@org.springframework.stereotype.Controller
@Slf4j
public class Controller {

	@GetMapping("/uploadForm")
	public void uploadForm() {
		log.info("This is uploadForm.");
		
	}
//	uploadFormAction.jsp를 찾아감
	@PostMapping("/uploadFormAction")
	public void uploadFormPost(MultipartFile[] uploadFile) {
		String uploadFolder = "D:\\dev\\upload";
		for(MultipartFile multipartFile : uploadFile) {
			log.info("====================");
//			getOriginalFilename : 업로드되는 파일 이름
			log.info("@# 업로드 되는 파일 이름 ==>"+multipartFile.getOriginalFilename());
//			getSize : 파일 크기
			log.info("@# 업로드 되는 파일 크기 ==>"+multipartFile.getSize());
//			File(저장경로,파일이름) 객체를 생성해서 saveFile로 받음.
			File saveFile = new File(uploadFolder,multipartFile.getOriginalFilename());
			try{
//				transferTo : savaFile 내용을 저장
				multipartFile.transferTo(saveFile);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@GetMapping("/uploadJquery")
	public void uploadJquery() {
		log.info("uploadJquery~!!!");
	}
	
	@PostMapping("/uploadAjaxAction")
//	ResponseEntity : 파일 정보를 클라이언트에게 넘기기위해서 사용
	public ResponseEntity<List<AttachFileDTO>> uploadAjaxPost(MultipartFile[] uploadFile) {
		log.info("@# uploadAjaxPost");
		
		List<AttachFileDTO> list = new ArrayList<AttachFileDTO>();
		
		String uploadFolder = "D:\\dev\\upload";
		String uploadFolderPath =  getFolder();
//		D:\\dev\\upload+년/월/일 폴더
		File uploadPath =new File(uploadFolder,uploadFolderPath);
		log.info("@# uploadPath =>"+uploadPath);
		if(uploadPath.exists()==false) { // uploadPath가 없으면
//			make yyyy/mm/dd folder 디렉토리를 만든다. (중복생성 방지)
			uploadPath.mkdirs();
		}
		
		
		for(MultipartFile multipartFile : uploadFile) {
			log.info("====================");
			log.info("@#uploadAjaxPost 파일 이름 ==>"+multipartFile.getOriginalFilename());
			log.info("@#uploadAjaxPost 파일 크기 ==>"+multipartFile.getSize());
//			File saveFile = new File(uploadFolder,multipartFile.getOriginalFilename());
//			File(저장경로_날짜별 처리된폴더,업로드할 파일) 객체 생성
			
			String uploadFileName = multipartFile.getOriginalFilename();
//			중복이름을 방지하기위한 무작위 문자생성 객체 UUID
			UUID uuid = UUID.randomUUID();
			log.info("@##@ uuid ==>"+uuid);
			
			AttachFileDTO attachFileDTO = new AttachFileDTO();
			attachFileDTO.setFileName(uploadFileName);
			attachFileDTO.setUuid(uuid.toString());
			attachFileDTO.setUploadPath(uploadFolderPath);
			log.info("@# attachFileDTO ==>"+attachFileDTO);
			
//			uuid_파일이름 형식으로 변경
			uploadFileName = uuid +"_"+uploadFileName;
			
//			파일을 저장할 saveFile 객체 생성(저장경로,uuid를 붙인 파일이름)
			File saveFile = new File(uploadPath,uploadFileName);
			try{
//				transferTo : saveFile 내용을 저장
				multipartFile.transferTo(saveFile);
//				저장할 File(saveFile)이 이미지파일이라면, 썸네일 파일을 만든다.
				if(checkImageType(saveFile)) {
//					이미지파일이라면 attachFileDTo의 Image 속성도 true로 변경
					attachFileDTO.setImage(true);
					
//					썸네일 파일은 s_을 앞에 추가
					FileOutputStream thumnail = 
					new FileOutputStream(new File(uploadPath,"s_"+uploadFileName));
//					Thumbnailator 라이브러리를 통해 썸네일 파일 형식을 100/100 크기로 생성
					Thumbnailator.createThumbnail(multipartFile.getInputStream(),thumnail,100,100);
					thumnail.close();
				}
//				list에 attachFileDTO를 담음
				list.add(attachFileDTO);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
//		ResponseEntity 객체의 body에 list를 넣고, http상태값 OK로 생성해서 리턴
//		이 컨트롤러를 요청하는 클라이언트의 ajax 구문에 ResponseEntity가 Http상태값 200 ok와 
//		AttachFileDTO가 담긴 리스트 객체를 반환해줌으로써 ajax의 success 구문이 진행될수있다.
		return new ResponseEntity<List<AttachFileDTO>>(list, HttpStatus.OK);
	}
//	날짜별로 폴더를 생성하는 메소드
	private String getFolder() {
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String str = sdf.format(date);
		log.info("@#str : "+str);
		log.info("@#separator : "+File.separator);
//		년-월-일 형식 replace: "-"를 "/"로 바꾼다.
		return str.replace("-",File.separator);
	}
	
//	썸네일 만들기위해 먼저 이미지 여부 체크(이미지 파일이면 true)
	public boolean checkImageType(File file) {
		try {
//		probeContentType : 이미지 파일인지 체크하기 위한 타입
			String contentType = Files.probeContentType(file.toPath());
//			probeContentType 메소드 버그로 로직 추가, 
			if(contentType ==null) {
				return false;
			}
			
			log.info("contentType ==>"+contentType);
//			startsWith : 파일 종류 판단(image 파일이면 true)
			log.info("startsWith ==>"+contentType.startsWith("image"));
			return contentType.startsWith("image");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	// 이미지 파일을 받아서 화면에 출력(byte[] 타입)
	@GetMapping("/display")
	@ResponseBody
	public ResponseEntity<byte[]> getFile(String fileName){
		log.info("@# fileName ===>"+fileName);
//		업로드 파일 경로 + 이름
		File file = new File("D:\\dev\\upload\\"+fileName);
		log.info("@# file ==>"+file);
		ResponseEntity<byte[]> result = null;
		HttpHeaders header = new HttpHeaders();
		try {
//		HttpHeaders 객체 생성후 add(컨텐츠타입,경로)메소드로 파일타입을 HTTP 헤더에 추가
			header.add("Content-Type", Files.probeContentType(file.toPath()));
//			파일 정보를 byte 배열로 복사+헤더정보+http상태 정상을 결과에 저장
			result = new ResponseEntity<>(FileCopyUtils.copyToByteArray(file),header,HttpStatus.OK);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return result;
	}
	// 파일 다운로드 메소드
	// 모든 파일은 내부적으로 bit 값을 가짐
	// APPLICATION_OCTET_STREAM_VALUE : 비트 스트림을 재조합하여 파일로 구성
	@GetMapping(value= "/download",produces= MediaType.APPLICATION_OCTET_STREAM_VALUE)
	@ResponseBody
	public ResponseEntity<Resource> downloadFile(String fileName){
		log.info("@# fileName ===>"+fileName);
//		파일을 리소스(자원)으로 변경, 파일을 비트값으로 전환
		Resource resource = new FileSystemResource("D:\\dev\\upload\\"+fileName);
		log.info("@# resource ===>"+resource.getFilename());
//		리소스에서 파일명을 찾아서 변수에 저장
		String resourceName = resource.getFilename();
//		uuid를 제거하기위해 파일명에서 _이전(uuid)은 자름.
		String resourceOriginalName =resourceName.substring(resourceName.indexOf("_")+1);
		HttpHeaders headers = new HttpHeaders();
		try {
//			헤더에 파일 다운로드 정보 추가
			headers.add("Content-Disposition", "attachment; filename="
					+new String(resourceOriginalName.getBytes("UTF-8"),"ISO-8859-1"));
		} catch (UnsupportedEncodingException e) {
			
			e.printStackTrace();
		}
//		윈도우 다운로드시 필요한 정보(리소스,헤더,상태 OK)
			return new ResponseEntity<Resource>(resource,headers,HttpStatus.OK);
	}
	
	
	@PostMapping("/deleteFile")
	@ResponseBody
	public ResponseEntity<String> deleteFile(String fileName,String type){
		log.info("@# fileName,type ==> "+fileName,type);
		File file;
//		URLDecoder.decode : 서버에 올라간 파일을 삭제하기 위해서 디코딩
		try {
			file =new File("D:\\dev\\upload\\"+URLDecoder.decode(fileName,"UTF-8"));
			file.delete();
//			이미지 파일이면 썸네일도 삭제
			if(type.equals("image")) {
//				getAbsolutePath : 절대경로(full path)에서 s_ 제거
				String largeFileName = file.getAbsolutePath().replace("s_","");
				log.info("@# largeFileName ==>"+largeFileName);
				file =new File(URLDecoder.decode(largeFileName,"UTF-8"));
				file.delete();
			
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
//			예외 오류 발생시 404 not Found 처리
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}// ajax의 success function(result)의 result값으로 "deleted"가 전송됨
		return new ResponseEntity<String>("deleted",HttpStatus.OK);
	}
	
	
}
