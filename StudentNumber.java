package JavaT;
class Student

{
	String name;
	static int studentCount=0;
	Student(String name)
	
	
	{
		this.name=name;
		studentCount++;
	}
	
	
	public static int getStudentCount(){
		return studentCount;
	}
}

public class StudentNumber 


{
	public static void main(String[] args) 
	
	
	{
		Student s1=new Student("Lesly");
		Student s2=new Student("Jo");
		Student s3=new Student("Johnson");
		
		
		
		int total_number=Student.getStudentCount();
		System.out.println("Number of Students: " + total_number);
		
		
	}
}
