import java.util.*;
public class Mean {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double arr[]=new double[11];
        double mean=0;
        for(int i=0;i<11;i++){
            arr[i]=sc.nextDouble();
            mean+=arr[i];
        }
        System.out.println("The Mean Height of the players is:"+mean/11);
    }
    
}
