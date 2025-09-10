package regular.bracket.sequence;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class RegularBracketSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        char[] ch=s.toCharArray();
        int counter=0;
        int size=s.length();
        for(int i=0;i<s.length();i++){
        
        if(ch[i]=='(')counter++;
        else{
           
            counter--;
            if(counter<0){counter=0;size--;}
        }
        }
        System.out.println(size-counter);
    }
    
}
