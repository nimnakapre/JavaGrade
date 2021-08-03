import java.util.Scanner;

public class Grade{
	public static void main (String[] args) {
		System.out.println("Enter your Marks: ");
		Scanner readinput=new Scanner(System.in);
		int Mark = readinput.nextInt();
		
		char result = Mark < 50 ? 'F' : (Mark>=50 && Mark<75) ? 'B' : 'A';		
		
		
		System.out.println("Grade: " +result);

				
		

		
	}
}