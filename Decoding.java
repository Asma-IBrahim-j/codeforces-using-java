package decoding;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class Decoding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String s1=scanner.next();
        int length=s1.length();
        String s2="";
        for(int i=0;i<s1.length();i++){
        if(length%2==0){s2=s1.charAt(i)+s2;length--;}
        else{s2=s2+s1.charAt(i);length--;}}
        System.out.println(s2);
        
}}
