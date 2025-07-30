package JavaTut;
class shape{
	public int area(int side) {
		System.out.println("I am square");
		return side*side;
		
	}
	public int area(int l,int b) {
		System.out.println("I am Rectangle");
		return l*b;
	}
	public float area(float radius) {
		System.out.println("I am Circle");
		return 3.14f*radius*radius;
	}
}

public class MethodOverloading {
	public static void main(String[]args) {
		
	}

}
