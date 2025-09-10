package colorfulstones;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class Colorfulstones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        String t=scanner.nextLine();
       char[]schar=s.toCharArray();
       char[]tchar=t.toCharArray();
      // char location=schar[0];
       int location=1;
       
       
       for(int i=0;i<tchar.length;i++){
           if(location<schar.length){
           if(tchar[i]==schar[location-1])location++;}
           /*for(int j=0;j<schar.length;j++){
           if(tchar[i]==schar)}*/
       
       }System.out.println(location);

       
        
        
    }
    
}
