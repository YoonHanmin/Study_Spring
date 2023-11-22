package package1;


public class Hello {
		public static void main(String[] args){
			Car myCar = new Car();
			ATire tire1 = new ATire();
			Tire tire = new ATire();
			myCar.run(tire);
			myCar.run(tire1);
		}
	}
