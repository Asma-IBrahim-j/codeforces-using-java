/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package another.one.bites.the.dust;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class AnotherOneBitesTheDust {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        long a=scanner.nextInt();
        long b=scanner.nextInt();
        long ab=scanner.nextInt();
        long x=0;
        if(a==b||b==a+1||a==b+1)x=a+b+2*ab;
        else if(a+1<b){if(a==0)x=1+2*ab;
              else  x=a+a+1+2*ab;}
        else if(b+1<a){if(b==0)x=1+2*ab;
        else x=b+1+b+2*ab;}
        System.out.println(x);
        
    }
    
}
