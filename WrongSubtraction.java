package wrong.subtraction;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class WrongSubtraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        for(int i=0;i<k;i++){
        if(n%10==0)n/=10;
        else n--;}
        System.out.println(n);
        
    }
    
}
