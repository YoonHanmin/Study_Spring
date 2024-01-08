package di;

public class Store {
	private Pencil pencil;
	
	public void use() {
		pencil.write();
	}
	public Store(Pencil pencil) {
		this.pencil = pencil;
	}
}
