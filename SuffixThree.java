package suffix.three;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class SuffixThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
        String s=scanner.next();
        if(s.endsWith("po"))System.out.println("FILIPINO");
        else if(s.endsWith("desu")||(s.endsWith( "masu")))System.out.println("JAPANESE");
        else if(s.endsWith("mnida"))System.out.println("KOREAN");}
    }
    
}
