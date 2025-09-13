package ksenia.and.pan.scales2;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class KseniaAndPanScales2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner scanner=new Scanner(System.in);
        String s=scanner.next();
        String u=scanner.next(); 
        String left="";
        String right="";
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='|'){left=s.substring(0, i);
        right=s.substring(i+1, s.length());}}
        
     /*  System.out.println("left:"+left);
       
        System.out.println("right:"+right);*/
        
        String result="";
        while(u.length()!=0){
        if(right.length()<left.length()){right=right+u.charAt(0);
        u=u.substring(1);}
        else if(right.length()>left.length()){left=left+u.charAt(0);
        u=u.substring(1);}
        else if(right.length()==left.length()){
            if(u.length()%2!=0){result="Impossible";break;}
            else {left=left+u.substring(0, u.length()/2);
            u=u.substring(u.length()/2, u.length());
            right=right+u.substring(0, u.length());
            u="";}}}
     /*   System.out.println("result:"+result+"  left:"+left+"   right:"+right);
        System.out.println("--------------");*/
        
        if(result=="Impossible"||right.length()!=left.length())System.out.println("Impossible");
        else System.out.println(left+'|'+right);
        
        
    }
    
}
