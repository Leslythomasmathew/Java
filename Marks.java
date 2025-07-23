package lesly;
import java.util.Scanner;
public class Marks {

public static void main(String[]args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the mark:");
	int num1=input.nextInt();
	if(num1>=90) {
		System.out.println("Grade A");
	}
	else if(num1>=75) {
		System.out.println("Grade B");
	}
	else if(num1>=60) {
		System.out.println("Grade C");
	}
	else if(num1>=40) {
		System.out.println("Grade D");
	}
	else{
		System.out.println("Fail");
	}
	}
}

