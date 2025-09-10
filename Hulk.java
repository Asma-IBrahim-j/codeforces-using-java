package hulk;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class Hulk {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
        if(i%2==0&&(i+1==n))System.out.println("I hate it");
        else if(i%2!=0&&(i+1==n))System.out.println("I love it");
        else if(i%2==0)System.out.print("I hate that ");
        else if(i%2!=0)System.out.print("I love that ");}
    }
    
}
