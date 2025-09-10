package yaroslav.and.permutations;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class YaroslavAndPermutations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[]array=new int[n];
        
        for(int i=0;i<n;i++){
        array[i]=scanner.nextInt();}
        int max=0;
        for(int i=0;i<n;i++){
            int counter=0;
        for(int j=0;j<n;j++){
        if(array[i]==array[j])counter++;}
        if(counter>max)max=counter;
        }
        //System.out.println(max);
        if(array.length%2==0){
          if((double)max/array.length<=.5)System.out.println("YES");
          else System.out.println("NO");}
        else{
            if(max<=(array.length)/2+1)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
