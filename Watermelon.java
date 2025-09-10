package watermelon;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class Watermelon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner s =new Scanner(System.in);
 int x =s.nextInt();
 if(x<=2||x%2==1||x>100)System.out.println("NO");
 else System.out.println("YES");
		
    }
    
}
