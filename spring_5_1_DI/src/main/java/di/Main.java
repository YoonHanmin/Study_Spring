package di;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
//		Store store = new Store(new Pencil());
//		store.use();
//		
//		Pencil2 pencil2 = new Pencil2();
//		Store2 store2 = new Store2(pencil2);
//		
//		store2.write();
//		
//		Magic magic = new Magic();
//		store2 = new Store2(magic);
//		
//		store2.write();
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:Bean.xml");
		Store2 store2 = ctx.getBean("store2",Store2.class);
		store2.write();
		
		
		
	}
	
}
