package search.in.matrix;

import java.util.Scanner;

/**
 *
 * @author asmaa
 */
public class SearchInMatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
int width=scanner.nextInt(); 
    int height=scanner.nextInt();
    int[][] array2D=new int[height][width]; 
    for(int i=0;i<height;i++){
    for(int j=0;j<width;j++){
        array2D[i][j]=scanner.nextInt();
    }}
    boolean x=false;
    int number=scanner.nextInt();
     for(int i=0;i<height;i++){
    for(int j=0;j<width;j++){
        if(array2D[i][j]==number){x=true;break;}
    }if(x)break;}
     if(x)System.out.println("will not take number");
     else System.out.println("will take number");
     
     
    }
    
}
