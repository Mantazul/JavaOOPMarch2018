package oop.polymorphism;

public class ModernCalculator extends LandCalculator {
	
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d -2;
		return total;
	}
}
