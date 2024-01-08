package di;

public class Store2 {
	private Product product;
	
	public void write() {
		product.use();
	}
	public Store2(Product product) {
		this.product =product;
		
	}
}
