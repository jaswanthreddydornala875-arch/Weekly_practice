import java.util.*;
public class Pr5 {
    public static void main(String[]args){
        Scanner sc =new Scanner (System.in);
        float num1,num2,c;
        System.out.println("Enter 1st number:");
        num1=sc.nextFloat();
        System.out.println("Enter 2nd number:");
        num2=sc.nextFloat();
        c=num1;
        num1=num2;
        num2=c;
        System.out.println(String.format("The numbers after swapping num1=%.2f, num2=%.2f ",num1,num2));
        sc.close();
    }
    
}
