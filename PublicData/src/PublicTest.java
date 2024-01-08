import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class PublicTest {
	public static void main(String[] args) {
		try {
//			DOM(HTML 객체) Document 객체로 생성
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
//			xml파일을 파싱(해석)하는 객체 생성
			DocumentBuilder parser = dbf.newDocumentBuilder();
			Document xmlDoc=null;
//			xml 파일 경로 설정
			String url="xml\\book.xml";
//			xml 파일을 파싱해서 Document 객체로 받음
			xmlDoc = parser.parse(url);
//			getDocumentElement :root Element(<booklist>)로 접근해서 Element 객체로 받음
			Element root = xmlDoc.getDocumentElement();
//			getElementsByTagName : root의 태그name을 통해 요소에 접근
//			item(index) : 첫번째 <book>Tag에 접근해서 Node 객체로 받음(Node: 하나의 요소)
			Node bookNode= root.getElementsByTagName("book").item(0);
//			<book>태그 요소를 Node로 보았을때, 하위태그가 존재하므로 Element 형변환을 통해 다시 하위태그(author)에 접근
			Node authorNode =((Element)bookNode).getElementsByTagName("author").item(0);
//			<author>값을 getTextContent()를 통해 얻는다.
			String author = authorNode.getTextContent();
//			<book>태그의 갯수를 구해서 for문을 통해 xml파일을 자바단에서 접근할수있다.
			int length = root.getElementsByTagName("book").getLength();
			
			for (int i = 0; i < length; i++) {
				Node bNode = root.getElementsByTagName("book").item(i);
//				getAttribute : xml 태그의 속성(property)에 접근
				String kind = ((Element)bNode).getAttribute("kind");
				System.out.println("@@kind : "+kind);
				Node tNode= ((Element)bNode).getElementsByTagName("title").item(0);
				System.out.println("@# tNode==>"+((Element)tNode).getTagName());
				System.out.println("tNode.getTextContent =>"+((Element)tNode).getTextContent());
				
				Node aNode= ((Element)bNode).getElementsByTagName("author").item(0);
				System.out.println("@# aNode==>"+((Element)aNode).getTagName());
				System.out.println("aNode.getTextContent =>"+((Element)aNode).getTextContent());

				Node pNode= ((Element)bNode).getElementsByTagName("price").item(0);
				System.out.println("@# pNode==>"+((Element)pNode).getTagName());
				System.out.println("pNode.getTextContent =>"+((Element)pNode).getTextContent());
				
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
