package effective.approach;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class EffectiveApproach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int[]array=new int[size+1];
        for(int i=1;i<=size;i++){
       int s=scanner.nextInt();
        array[s]=i;}
        
       int queries=scanner.nextInt();
       int[]integers=new int[queries];
       for(int i=1;i<=queries;i++){
           integers[i-1]=scanner.nextInt();
       } 
       long counter1=0;long counter2=0;
       long countertotal=0;
       for(int i=0;i<queries;i++){
      
      counter1=array[integers[i]];
       counter2+=size+1-counter1;
       countertotal+=counter1;
       counter1=0;
       }
      
        System.out.println(countertotal+" "+counter2);
    }
    
}
