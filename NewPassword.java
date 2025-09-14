package pkgnew.password;


import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class NewPassword {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int k=scanner.nextInt();
        char []alphabet=new char[k];
        for(int i=0;i<k;i++){
            alphabet[i]=(char)(97+i);
        }
       
        String password="";
        int i=0;
      while(i<n){
            
            if(i>=k)i=0;
             password=password+alphabet[i];
            i++;
            if(password.length()==n)break;
        }
        System.out.println(password);
        
    }
    
}
