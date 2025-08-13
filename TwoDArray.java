package ArrayDemo;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Row :");
		int row =sc.nextInt();
		System.out.print("Enter the Column :");
		int col =sc.nextInt();
		int[][] matrix = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print("Enter the value : ");
				matrix[i][j] = sc.nextInt();
				
			}
		
		}
		
		for(int i=0;i<row;i++) {
			for(int j = 0;j<col;j++) {
				System.out.print(matrix[i][j]+"\t");
				
				
			}
			System.out.println();
		
		}
		System.out.print("Transpose \n");
		
		for(int i=0;i<col;i++) {
			for(int j = 0;j<row;j++) {
	
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
				
	}

}