package some.sums;

import java.util.Scanner;


public class SomeSums {

    
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
short N= scanner.nextShort();
short A= scanner.nextShort();
short B= scanner.nextShort();

 int summation=0;

for(int i=1;i<=N;i++){
 int sum=0;
 int x=i;
 while(x!=0){  
   sum =sum+(x%10);
 x/=10;}
 
 
 if(sum >=A&&sum<=B)summation+=i;
 else continue;

}
        System.out.println(summation);
    }
    
}
