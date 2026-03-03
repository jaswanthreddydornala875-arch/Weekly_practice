import java.util.*;
public class Pra1 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        float num1,num2;
        System.out.println("Enter 1st number:");
        num1=sc.nextFloat();
        System.out.println("Enter 2nd number");
        num2=sc.nextFloat();
        System.out.println(String.format("The addition,subtraction,multiplication,and division value of 2 number %.2f and %.2f is %.2f, %.2f, %.2f, and %.2f",num2,num2,num1+num2,num1-num2,num1*num2,num1/num2));
        sc.close();
    }
    
}
