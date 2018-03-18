package oop.polymorphism;

public class LandCalculator {

	public int areaOfLand(int a, int b) {
		int total = a + b;
		return total;
	}
	public int areaOfLand(int a, String st) {
		int total = a ;
		System.out.println(st);
		return total;
	}
	public int areaOfLand(String st, int a) {
		int total = a ;
		return total;
	}
	public final int areaOfLand(int a, int b, int c) {
		int total = a + b + c;
		return total;
	}
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		return total;
	}
}
