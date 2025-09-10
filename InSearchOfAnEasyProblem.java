package in.search.of.an.easy.problem;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class InSearchOfAnEasyProblem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        boolean z=false;
        for(int i=0;i<n;i++){
        int s=scanner.nextInt();
        if(s==1){z=true;break;}}
        if(z)System.out.println("hard");
        else System.out.println("easy");
        
    }
    
}
