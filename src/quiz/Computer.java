package quiz;

public class Computer {

	public int ramSize;
	public int screenSize;
	public static int cpu;
	
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public static void setSrcreenSize() {
		System.out.println("This is static method");
	}
	
}
