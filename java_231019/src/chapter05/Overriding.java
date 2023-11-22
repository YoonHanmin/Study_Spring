package chapter05;

class Weapon{
	protected int fire() {  //파이어벳의 기본 공격력 : 1
		return 1;
	}
}
class Cannon extends Weapon{ // 시즈탱크
	@Override
	protected int fire() {
		return 10;
	}
	protected void sizemode() {
		System.out.println("시즈모드");
	}
	
}


public class Overriding {
	public static void main(String[] args) {
		Weapon weapon;
		weapon = new Weapon();
		System.out.println("기본 공격력 : "+weapon.fire());
		weapon = new Cannon(); // upcasting
		System.out.println("대포 공격력 : "+weapon.fire());
		
	
	}
}
