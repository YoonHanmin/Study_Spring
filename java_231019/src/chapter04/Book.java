package chapter04;

public class Book {
	String title;
	String author;
	
	public Book(String title,String author) {
		System.out.println("생성자 1 호출됨");
		this.title = title;
		this.author = author;
	
		
	}
	public void getBook(String title) {
		this.title = title;
	}
	public Book(String title) {
		this(title,"작자미상");
//		첫 라인에 안오면 오류발생
		System.out.println("생성자 2 호출됨");
	}
	public Book() {
		this("","");
		System.out.println("생성자 3 호출됨");
		
	}
	void show() {
		System.out.println(title+author);
	}
	public static void main(String[] args) {
		String name = "ad";
	Book littlePrince= new Book("어린왕자","생택쥐베리");
	Book loveStory = new Book("춘향전");
	Book emptyBook = new Book();
	littlePrince.show();
	loveStory.show();
	emptyBook.show();
	loveStory.getBook(name);
	
	
	}
	
	
	
}
