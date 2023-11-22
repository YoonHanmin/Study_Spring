package chapter07;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv,String> product1 = new Product<>();
		product1.setKind(new Tv());
//		1.setKind에 의해 Tv kind = new Tv();
//		2. Tv 필드의 T kind = new Tv();
		product1.setModel("스마트TV");
		Tv tv = product1.getKind(); // 매개변수 new Tv();를 받음
		String tvmodel = product1.getModel();
		System.out.println(tvmodel);
		
//		제네릭을 통해 객체 타입 변환없이 처리된다.
		
		Product<Car,String> product2 =new Product<Car, String>();
		product2.setKind(new Car());
		product2.setModel("Sonata");
		Car car = product2.getKind();
		System.out.println(product2.getModel());
		Tv<Car> tv1 = new Tv();
		tv1.t = "ss";
	
	}
}
