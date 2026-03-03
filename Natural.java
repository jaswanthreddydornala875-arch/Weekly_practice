import java.util.*;
public class Natural {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n,ans;
        System.out.println("Enter a natural number:");
        n=sc.nextInt();
        if(n>=0){
            ans=(n*(n+1))/2;
            System.out.println(String.format("The sum of %d natural numbers is %d",n,ans));
            return;
        }
        System.out.println(String.format("The number %d is not a natural number",n));
        sc.close();
    }
    
}
