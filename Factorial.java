package factorial;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        	    Scanner s =new Scanner(System.in);
	     int x =s.nextInt();
	     int factorial = 1;
 for (int i=1;i<=x;i++){
     factorial=i*factorial;
     
 }
 System.out.println(factorial);
    }
    
}
