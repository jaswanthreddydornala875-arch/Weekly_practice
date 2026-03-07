import java.util.*;
public class Armstrong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number,sum=0,rem,n;
        System.out.println("Enter a 3digit number:");
        number=sc.nextInt();
        n=number;
        if(n>99&&n<=999){
            while(number>0){
                rem=number%10;
                sum+=(rem*rem*rem);
                number/=10;
            }
            if(n==sum){
                System.out.println("The given number is Armstrong number");
            }
            else{
                System.out.println("The given number is not an Armstrong number");
            }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
