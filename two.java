package hackathon;

import java.util.Scanner;

public class two {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a postive number");
		
		int number = scanner.nextInt();
		
		
		int Factorial = 1;
		
		
		for(int i= 1; i<=number; i++) {
			
			
			
			
			Factorial = Factorial *i;
			
			
		}
		
		System.out.println(Factorial);
		
		scanner.close();
		
		
		
	}
	
}


