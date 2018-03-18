package oop.encapsulation;

public class TestStudent {

	public static void main(String[] args) {
		Student st1 = new Student();
	    st1.setStID(101);
	    st1.setStName("Aftab");
	    st1.setStDOB("11-19-1989");
	    System.out.println(st1.getStID()+ " "+ st1.getStName()+" "+ st1.getStDOB());
	    
	    Student st2 = new Student();
	    st2.setStID(102);
	    st2.setStName("Moyna");
	    st2.setStDOB("02-01-1991");
	    System.out.println(st2.getStID()+ " "+ st2.getStName()+" "+ st2.getStDOB());

	}

}
