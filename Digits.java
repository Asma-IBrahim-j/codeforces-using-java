package digits;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        long[] array;
        array = new long[num];
        for(int i=0;i<num;i++){
        array[i]=scanner.nextLong();
        }
        for(int i=0;i<num;i++){
        splitdigits(array[i]);
                   System.out.println("");
}
      
    }
    public static void splitdigits(long a){
        int digits =String.valueOf(a).length();
        
        for(int i=0;i<digits;i++){   
       
          long  x=a%10;
        System.out.print(x+" ");
        if(digits>1)a/=10; }
        }

        }
        
        
    
    

