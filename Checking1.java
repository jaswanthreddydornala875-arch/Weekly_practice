import java.util.*;
public class Checking1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n,sum1=0,sum2;
        System.out.println("Enter the ending number:");
        n=sc.nextInt();
        sum2=(n*(n+1))/2;
        for(int i=1;i<=n;i++){
            sum1+=i;
        }
        if(sum1==sum2){
            System.out.println("Both are equal and the final answer is: "+sum1);
        }
        sc.close();
    }
    
}
