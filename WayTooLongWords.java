package way.too.pkglong.words;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class WayTooLongWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
        String s=scanner.next();
        if(s.length()<=10)System.out.println(s);
        else{System.out.println(s.charAt(0)+""+(s.length()-2)+""+s.charAt(s.length()-1));}}
    }
    
}
