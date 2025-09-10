package summation;

import java.util.Scanner;


public class Summation {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        long number=scanner.nextLong();
        long summation=number*(number+1)/2;
        System.out.println(summation);
    }
    
}
