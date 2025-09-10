package big.bear;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class BigBear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int counter=0;
        while(a<=b){
        a=a*3;
        b=b*2;
        counter++;}
        System.out.println(counter);
    }
    
}
