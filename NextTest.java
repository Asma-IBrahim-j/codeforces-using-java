package next.test;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class NextTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner =new Scanner(System.in);
        int n=scanner.nextInt();
        
        
        int[]s=new int[n];
        for(int i=0;i<n;i++){
            s[i]=scanner.nextInt();
            }
      
        for(int i=0;i<n;i++){ int min=s[i];
            int t=0;
            for(int j=i;j<n;j++){
           if(s[j]<=min){min=s[j];t=j;}
       }s[t]=s[i];
            s[i]=min;}
        int x=1;
        for(int i=0;i<n;i++){
        if(s[i]==x)x=s[i]+1;
        }
    
    System.out.println(x);
    }
            
        
      //  for(int i=0;i<n;i++){System.out.print(s[i]+" ");}
      }  //
    
    

