package nightatthemuseum;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class Nightatthemuseum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char[]schar=s.toCharArray();
        char a='a';
        int rotations=0;
        if((schar[0]-a)>13){ rotations=(26-(schar[0]-a));}
        else { rotations=schar[0]-a;}
        
        
        for(int i=1;i<schar.length;i++){
        char x=schar[i-1];
        char y=schar[i];
           
      int z=Math.abs(y-x);
      if(z>13)rotations=rotations+(26-z);
      else rotations+=z;
         
        }
        
       System.out.println(rotations);
        
        
    }
    
}
