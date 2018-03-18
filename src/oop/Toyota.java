package oop;

public class Toyota extends ModernCar implements Car, Motor {

	//Car Interface
	public void start() {
		System.out.println("let's drive the car, don't worry about how to start");
	}
	public void stop() {
	   System.out.println("Have a break system to stop the car");		
	}
	public void carShape() {
		System.out.println("shpe should not be more than 6 feet long and 4 feet wide");	
	}
	//Toyota class
	public void bodyColor() {
		System.out.println("Car has multiple color");
	}
	//Motor Interface
	public void engine() {
		System.out.println("Car run by motor engine");
		
	}
	public void fuelType() {
		System.out.println("Run on oil");
		
	}
	public void hydraulicBreak() {
        System.out.println("This car has hydraulic break system");
		
	}
}
