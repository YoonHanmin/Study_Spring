package question06;

public class Tv {
	String name;
	int year;
	int inch;
	public Tv(String name,int year,int inch) {
		this.name = name;
		this.year = year;
		this.inch = inch;
	}
		public void show() {
			System.out.println(this.name+"에서 만든"+ this.year+"년형"+this.inch+"인치 TV");
		}
		
		
		public static void main(String[] args) {
			Tv myTv = new Tv("LG",2017,32);
			myTv.show();
		}
		
	}
	

