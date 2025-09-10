package good.number;

import java.util.Scanner;

/*
 *
 * @author asmaa
 */
public class GoodNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        int[] N=new int[n];
        for(int i=0;i<n;i++){
            N[i]=scanner.nextInt();
        }
        int total=0;
       
        for(int i=0;i<n;i++){
             String string=String.valueOf(N[i]);
      int s=string.length();
            int a=N[i];
              boolean[]flag=new boolean[k+1];
        for(int j=0;j<s;j++){
            
      
            if(a==0)break;
         if(a%10<=k){
          if(a%10==j){a/=10;
            flag[j]=true;j=-1;
          //if(a==0)break;
          }}
         else if(a%10>k) {a/=10; j=-1;}
            
           }boolean x=true;
            for(int j=0;j<k+1;j++){
             //   System.out.println(flag[j]+"---");
            if(flag[j]==false)x=false;}
            
            if(x)total++;
           }
        System.out.println(total);
       //System.out.println(10%10);
        } 
           
          
       
    }
    
   

