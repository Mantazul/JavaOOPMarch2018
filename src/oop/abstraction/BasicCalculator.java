package oop.abstraction;

public abstract class BasicCalculator {
	// we can not implement interface in abstract class
	// we can have abstract methods and implemented methods here
	public void addition(int a, int b) {
		System.out.println(a+b);
	}
	public abstract void subtraction(int a, int b);
}
