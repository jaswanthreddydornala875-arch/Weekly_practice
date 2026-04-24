import java.util.*;
public class Check {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<5;j++){
            if(arr[j]==0){
                System.out.println("It is Equal to Zero");
            }
            else if(arr[j]>0){
                if(arr[j]%2==0){
                    System.out.println("It is an Even Number");
                }
                else{
                    System.out.println("It is an Odd number");
                }
            }
            else{
                System.out.println("It is a Negative number");
            }
        }
        if(arr[0]>arr[4]){
            System.out.println("First Element is Greater than Last Element");
        }
        else{
            System.out.println("Last Element is Greater than First Element");
        }
    }
    
}
