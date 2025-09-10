package george.and.accommodation;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class GeorgeAndAccommodation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int counter=0;
        for(int i=0;i<n;i++){
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        if(p+2<=q)counter++;}
        System.out.println(counter);
    }
    
}
