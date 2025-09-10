package pum;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class Pum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int w =scanner.nextInt();
        int x=1;
        for(int i=0;i<w*4;i++){
            if(x%4!=0)System.out.print(x++ +" ");
            else {System.out.println("PUM");
            x++;}
        /*for (int j=0;j<=3;j++){
            if(j!=3)System.out.print(x++ +" ");
           
            else{ System.out.println("PUM");
                    x++;}*/
        }
           }
    }
    
