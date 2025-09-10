package domino.piling;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class DominoPiling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        System.out.println(n*m/2);
    }
    
}
