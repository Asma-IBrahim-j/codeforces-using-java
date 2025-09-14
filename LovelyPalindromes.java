package lovely.palindromes;


import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class LovelyPalindromes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        String n=s.next();
        
        StringBuilder sb=new StringBuilder();
        sb.append(n);
        StringBuilder sd=new StringBuilder();
      sd.append(n).reverse();
      sb.append(sd);
        System.out.println(sb);
        
        
       
        
       
            
       
    }
    
}
