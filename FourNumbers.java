package fournumbers;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class Fournumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        short a =scanner.nextShort();
        short b=scanner.nextShort();
        short c=scanner.nextShort();
        short d=scanner.nextShort();
        System.out.println((long)a*b*c*d);


    }
    
}
