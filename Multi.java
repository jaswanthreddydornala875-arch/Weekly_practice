import java.util.*;
public class Multi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int arr[]=new int[10];
        int num=sc.nextInt();
        for(int i=1;i<11;i++){
            arr[i-1]=num*i;
        }
        for(int j=0;j<10;j++){
            System.out.println(num+"*"+(j+1)+"="+arr[j]);
        }
    }
    
}
