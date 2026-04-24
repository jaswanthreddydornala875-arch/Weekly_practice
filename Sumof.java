import java.util.*;
public class Sumof {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double arr[]= new double[10];
        double sum=0;
        int i=0;
        boolean is=true;
        while(is){
            arr[i]=sc.nextDouble();
            if(arr[i]<0 || arr[i]==0 ||i==9){
                is=false;
            }
            i++;
        }
        for(int j=0;j<10;j++){
            sum+=arr[j];
        }
        System.out.println(sum);
    }
    
}
