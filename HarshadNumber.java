import java.util.*;
public class HarshadNumber {
    public static void main(String[]agrs){
        Scanner sc = new Scanner(System.in);
        int number,sum=0,n,rem;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        n=number;
        if(number>0){
            while(number>0){
                rem=number%10;
                sum+=rem;
                number/=10;
            }
            if(n%sum==0){
                System.out.println("It is a Harshad Number");
            }
            else{
                System.out.println("It is not a Harshad Number");
            }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
