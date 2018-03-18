package oop.abstraction;

public class ScientificCalculator extends BasicCalculator implements Calculator {

	public static void main(String[] args) {
		// concrete class
		// we can implement interface and extends abstract class
		
		BasicCalculator sc = new ScientificCalculator();
		sc.addition(2, 2);
		sc.subtraction(5,2);
	}
	public void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		
	}
	public void addition1(int a, int b) {
		// TODO Auto-generated method stub
	}
}
