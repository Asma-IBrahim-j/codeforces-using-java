package sum.of.consecutive.odd.numbers;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        short T=scanner.nextShort();
       
        for(int i=0;i<T;i++){
             int x=scanner.nextInt();
             int y=scanner.nextInt();
             int sum=0;
             if(x<y){
                for(int j=x+1;j<y;j++){
                    if(j%2==0)continue;
                    else sum+=j;
                }}
                    else if(x>y){ 
                        for(int j=y+1;j<x;j++){
                         if(j%2==0)continue;
                         else sum+=j;

                    }}
                else sum=0;
             System.out.println(sum);
                
            }
          
        }
        
            }
               
   
        
        
        

    

