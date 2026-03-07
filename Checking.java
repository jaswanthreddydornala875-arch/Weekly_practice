import java.util.*;
public class Checking {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n,sum1=0,sum2;
        System.out.println("Enter the ending number:");
        n=sc.nextInt();
        sum2=(n*(n+1))/2;
        while(n!=0){
            sum1+=n;
            n--;
        }
        if(sum1==sum2){
            System.out.println("Both are equal and the final answer is: "+sum1);
        }
        sc.close();
    }
    
}
