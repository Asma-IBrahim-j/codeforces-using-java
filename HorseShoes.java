package horseshoe;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author asmaa
 */
public class Horseshoe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int s1=scanner.nextInt();
        int s2=scanner.nextInt();
        int s3=scanner.nextInt();
        int s4=scanner.nextInt();
        //int counter=0;
        Set<Integer> s=new HashSet<>();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        System.out.println(4-s.size());
        
        //List<Integer> ss=new List<>();
     /* if(s1==s2){counter=1;
          if(s1==s3){counter=2;
              if(s1==s4)counter=3;}
          else if(s3==s4){counter=2;}
          else if(s3!=s4){counter=1;}
          System.out.println(counter);
      }
      else if()*/
    }
    
}
