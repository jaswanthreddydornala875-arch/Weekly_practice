import java.util.*;
public class RocketLaunch1{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter number to count from:");
        n=sc.nextInt();
        if(n>0&&n>1){
            while(n>=1){
                System.out.println(n);
                n--;
            }
            return;
        }
        System.out.println("Invalid input.");
        sc.close();
    }
}