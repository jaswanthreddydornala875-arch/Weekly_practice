import java.util.*;
public class Vote {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int []arr= new int[10];
        for(int i=0;i<10;i++){
                arr[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++){
            if(arr[j]>=18){
                System.out.println("The Student with age"+arr[j]+"can Vote");
            }
            else if(arr[j]<0){
                System.out.println("Invalid Input");
            }
            else{
                System.out.println("The Student with age"+arr[j]+"cannot vote");
            }
        }
    }
    
}
