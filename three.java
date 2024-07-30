package hackathon;

import java.util.Arrays;


public class three {

	public static void main(String[] args) {
		
		
		String Str1 = "anagraM";
	       String Str2 = "margana";
	       
	        char[] str1 = Str1.toLowerCase().toCharArray();;
	        
	        char[] str2 = Str2.toLowerCase().toCharArray();
	       
	        Arrays.sort(str1);
	        Arrays.sort(str2);
	         
	         if(Arrays.equals(str1, str2 )){
	             
	             System.out.println("Anagrams");
	             
	         }else{
	              System.out.println(" Not Anagrams");
	         }
	         
	        
	        
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
