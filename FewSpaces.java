// Project: FewSpaces.java
// This program inputs a sentence and prints ir with fewer spaces.

import java.util.Scanner;

public class FewSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "";
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        
        while(!(str.equals(".")))
        { System.out.print(str + " ");
          str = scan.next();
        }
        	
        
        
	}
}
