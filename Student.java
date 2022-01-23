package student.java1;

public class Student 
{
	String name = "Yuvaraja";
	byte rollNumber = 5;
	
	public void printCollege()
	{
		System.out.println("college Name : " + "Saveetha Engineering");
		
	}
	private int getRollNumber()
	{
		int roll=75;
		return(roll);
	}
	void collegeName(String name)
	{
		System.out.println(name);
				
	}
	public static void main (String[] args) {
		
		Student object = new Student ();
		object.printCollege();
		int num = object.getRollNumber();
		System.out.println("Roll number : " + num);
		System.out.println("Student Name :" + object.name);
		
		
	
	}
	
}