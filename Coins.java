package i.coins;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class ICoins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
       // String s1=scanner.nextLine();
       // String s2=scanner.nextLine();
       // String s3=scanner.nextLine();
        
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<3;i++){
            String s=scanner.nextLine();
            if(s.charAt(1)=='<'){
            if(s.charAt(2)=='A')a++;
            else if(s.charAt(2)=='B')b++;
            else if(s.charAt(2)=='C')c++;}
            
            else{if(s.charAt(0)=='A')a++;
            else if(s.charAt(0)=='B')b++;
            else if(s.charAt(0)=='C')c++;
            }
        }
      //  String s;
     /*  if( s1.charAt(0)=='A'){
          if(s1.charAt(1)=='<')b++;
          else a++;}
       else{if(s1.charAt(1)=='<')a++;
          else b++;}
       
       if(s2.charAt(0)=='B'){
          if(s2.charAt(1)=='<')c++;
          else b++;}
       else{if(s2.charAt(1)=='<')b++;
          else c++;
       }
       
       if(s3.charAt(0)=='A'){
          if(s3.charAt(1)=='<')c++;
          else a++;}
       else{  if(s3.charAt(1)=='<')a++;
          else c++;}*/
       // System.out.println(a+" "+b+" "+c);
        
        if(a==b&&a==c)System.out.println("Impossible");
        else if(a==0){
                if(b==1)System.out.println("ABC");
                else if(c==1) System.out.println("ACB");
        }else if(b==0){
                if(a==1)System.out.println("BAC");
                else if(c==1)System.out.println("BCA");
        }else if(c==0){
            if(a==1)System.out.println("CAB");
            else if(b==1)System.out.println("CBA");}
    
    
    
    }
       
                
    }
    
