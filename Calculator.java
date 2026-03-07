import java.util.*;
public class Calculator {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double first,second;
        String op;
        System.out.println("Enter First number:");
        first=sc.nextDouble();
        System.out.println("Enter Second number:");
        second=sc.nextDouble();
        System.out.println("Enter a Operator(+,-,*,/):");
        op=sc.next();
        switch(op){
            case "+":
                System.out.println(first+second);
                break;
            case "-":
                System.out.println(first-second);
                break;
            case "*":
                System.out.println(first*second);
                break;
            case "/":
                System.out.println(first/second);
                break;
            default:
                System.out.println("Invalid Operator");

        }
        sc.close();

    }
    
}
