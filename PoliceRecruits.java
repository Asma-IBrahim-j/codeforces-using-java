package police.recruits;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class PoliceRecruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int officers=0;
        int untreatedcases=0;
        for(int i=0;i<n;i++){
        int x=scanner.nextInt();
        if(x<0){if(officers==0)untreatedcases++;
        else officers--;}
        else{officers+=x;}}
        System.out.println(untreatedcases);
    }
    
}
