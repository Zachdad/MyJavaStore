// Project: HelloJava3.java
// this is a program that takes a number and shows you the next prime.
import java.util.Scanner;

public class HelloJava3 {

   public static void main(String[] args) {
	   
    
	int i, number=Integer.MAX_VALUE;
	//String s;										
	Scanner input = new Scanner(System.in);
    System.out.println("Hello Java class 2018, please enter a number ");
    number = input.nextInt();
  
    if(number == 0 || number == 1)
	   System.out.printf("the number is %d and the Next prime is %d",
		               number, 2);
	else  				                      
	   for ( i = number + 1;  i < Integer.MAX_VALUE; i++ )
   	   {
		  if (isPrime (i)) 
		  {  System.out.printf("the number is %d and the Next prime is %d",
				        				number, i); 
		    break;
		  }
				            
	    } 
				       						
   }					
	 public static boolean isPrime(int number) {				    	
		int sqrt = (int) Math.sqrt(number) + 1;
		
    	for (int j = 2; j < sqrt; j++)	
		   if (number % j == 0) return false; 
		return true; 
     }  
		
}
