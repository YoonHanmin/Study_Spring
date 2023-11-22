package chapter05;

class Shape{
	public void draw() {
		System.out.println("Shape");
	}}
class Line extends Shape {
	public void draw() {
		System.out.println("Line");		
	}}
class Rect extends Shape {
	public void draw() {	
		System.out.println("Rect");
	}}
class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}}
public class MethodOverridingEX {
	static void paint (Shape p) {
//		매개변수타입은 Shape인데 이를 상속받은 Line타입이 왔으므로 자동 upcasting
		p.draw();}
	public static void main(String[] args) {
	Line line = new Line();
	paint(line); // Shape의 draw로 갔다가 오버라이딩 되어서 Line으로 간다 = 동적 바인딩
	paint(new Rect());	
		
		
		
}
}
