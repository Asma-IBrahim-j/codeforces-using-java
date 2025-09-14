package sum.of.digits;


import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class SumOfDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String r=scanner.next();
       
       int counter=0; 
     
      while(r.length()>1){
          int sum=0;
        for(int i=0;i<r.length();i++ ){
            sum=sum+r.charAt(i)-48;
        }
        //System.out.println("sum:"+sum);
        r=String.valueOf(sum);
        counter++;
        
      }
       System.out.println(counter);
    }
    
}
