import java.util.*;
public class RocketLaunch2{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("Enter number to count from:");
        n=sc.nextInt();
        if(n>0&&n>1){
            for(int i=n;i>=1;i--){
                System.out.println(i);
            }
            return;
        }
        System.out.println("Invalid input.");
        sc.close();
    }
}