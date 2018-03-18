package oop.polymorphism;

public class TestLandCalculator {

	public static void main(String[] args) {
		LandCalculator lc = new LandCalculator();
		System.out.println("Point A to Point B :" + lc.areaOfLand(10, 5));
		System.out.println("Point A to Point B :" + lc.areaOfLand(10, "sabuz is confuzed"));
		System.out.println("Size of a Rectangle from LandCalculator :" + lc.areaOfLand(10, 5, 12, 18));
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println("Size of a Rectangle from ModernCalculator :"+mc.areaOfLand(10, 5, 12, 18));
	
	}

}
