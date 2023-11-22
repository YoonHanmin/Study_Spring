package chapter02;

public class Cylinder {
		public static void main(String[] args) {
			double r=7;
			double h=5;
			double v=volume(r,h);
			
		}
		public static double volume(double radius, double height) {
			return Math.PI*radius*radius*height;
		}

}

