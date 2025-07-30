package JavaTut;

class student{
	String Name;
	int rollNumber;
	int mark1;
	int mark2;
	int mark3;
	float average;
	
	student(String Name,int rollNumber,int mark1,int mark2,int mark3){
		this.rollNumber = rollNumber;
		this.Name = Name;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	
	public void calculateAverage() {
		average = (mark1+mark2+mark3)/3;
	}
	
	public void displayDetails() {
		System.out.println("Name :"+Name);
		System.out.println("Roll Number :"+rollNumber);
		System.out.println("Mark1 :"+mark1);
		System.out.println("Mark1 :"+mark2);
		System.out.println("Mark1 :"+mark3);
		System.out.println("Average of Total Mark :"+average);
	}
}

public class Student{
	public static void main(String[] args){
		student st1 = new student("Lesly",53,88,90,84);
		
		st1.calculateAverage();
		student st2 = new student("Johnson",46,95,90,89);
		st2.calculateAverage();
		st1.displayDetails();
		st2.displayDetails();
	}
}