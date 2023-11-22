package chapter09;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args)throws Exception {
		File dir = new File("d:/aaa/bbb");
		File file1 = new File("d://aaa/file1.txt");
		File file2 = new File("d://aaa/file2.txt");
		File file3 = new File("d://aaa/file3.txt");
		dir.mkdirs();
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		File test = new File("d:/aaa");
		File[] contents = test.listFiles();
		System.out.println("날짜 	시간 		형태 	크기 	이름");
		System.out.println("----------------------------------------");
		for (int i = 0; i < contents.length; i++) {
//			1699860255516 : 1970.1.1 기준으로 오늘까지의 milisec로 계산된 값
//			System.out.print(contents[i].lastModified()); //마지막 생성일자
//			System.out.println(contents[i]);
			System.out.print(sdf.format(new Date(contents[i].lastModified()))); //마지막 생성 일자
//			System.out.println(contents[i].getName());
		
		if(contents[i].isDirectory()) { //디렉토리 이면
			System.out.println("\t<DIR>\t\t"+contents[i].getName());
		}else {
			System.out.println("\t\t"+contents[i].length()+"\t"+contents[i].getName()); //디렉토리 파일 이나 이름
		}
	}
	}
}
