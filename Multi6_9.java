import java.util.*;
public class Multi6_9 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[4];
        int k=6;
        for(int i=0;i<4;i++){
                arr[i]=num*k;
                k++;
        }
        k=6;
        for(int j=0;j<4;j++){
            System.out.println(num+"*"+k+"="+arr[j]);
            k++;
        }
    }    
}
