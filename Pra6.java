import java.util.*;
public class Pra6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter 1st number:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd number:");
        num2=sc.nextInt();
        int quo=num1/num2;
        int rem=num1%num2;
        System.out.println(String.format("The Quotient is %d and Remainder is %d of two number %d and %d",quo,rem,num1,num2));
        sc.close();
    }
    
}
