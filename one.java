package hackathon;

import java.util.Scanner;

public class one {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter a boolean vaule like True/False");
		boolean a = scanner.nextBoolean();
		
		System.out.println("Enter the Second boolean vaule like True/False");
		boolean b = scanner.nextBoolean();
		
		System.out.println("Enter the Third boolean vaule like True/False");
		boolean c = scanner.nextBoolean();
		
		if((a&b)||(a&c)||(c&b)) {
			
			System.out.println("Atleast two out of three is true");
			
			
		}else {
			
			
			System.out.println("least two out of three is true");
			
		}
		
		scanner.close();
	}

}
