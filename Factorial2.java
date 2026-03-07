import java.util.*;
public class Factorial2{
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        double ans=1;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n==0||n==1){
            System.out.println("The factorial is 1");
            return;
        }
        if(n>0){
            for(int i=1;i<=n;i++){
                ans*=i;
            }
            System.out.println("The factorial is:"+ans);
        }
        else{
            System.out.println("Invalis input");
        }
        sc.close();
    }
    
}
