import java.util.*;
public class Multi_To_Single {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr2[][]=new int[row][column];
        int arr1[]=new int[row * column];
        //input for 2d
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        //copying
        int k=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                arr1[k]=arr2[i][j];
                k++;
                
            }
        }
        for(int l:arr1){
            System.out.print(l+" ");
        }
    }
    
}
