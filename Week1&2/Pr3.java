import java.util.*;
public class Pr3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float sal,bonus,total;
        System.out.println("Enter the Salary:");
        sal=sc.nextFloat();
        System.out.println("Enter bonus:");
        bonus=sc.nextFloat();
        total=sal+bonus;
        System.out.println(String.format("The Salary is INR %.2f and bonus is INR %.2f.Hence Total Income is INR %.2f",sal,bonus,total));
        sc.close();
    

    }
    
}
