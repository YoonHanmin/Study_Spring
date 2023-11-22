package package1;

public class Getter {
	private int id;
	private String name;

	public void setId(int id) {
		if (this.id != id) {
			this.id = id;
		} else {
			System.out.println("중복된 번호");
		}
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
