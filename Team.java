package team;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class Team {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int s=0;
        for(int i=0;i<n;i++){
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c=scanner.nextInt();
        if (a+b+c>1)s++;}
        System.out.println(s);
    }

    }
    

