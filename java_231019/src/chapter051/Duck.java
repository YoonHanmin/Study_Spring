package chapter051;

public class Duck extends Bird implements Swim,Fly {

	@Override
	public void swim() {
		System.out.println("duck swim");
		
	}

	@Override
	public void fly() {
		System.out.println("ducks fly");
		
	}
	
	

}
