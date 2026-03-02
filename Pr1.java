import java.util.*;
public class Pr1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float celsius;
        System.out.println("Enter Temperature:");
        celsius=sc.nextFloat();
        float fah;
        fah=(celsius*(9/5f))+32;
        System.out.println(String.format("The %.2f celsius is %.2f fahrenheit",celsius,fah));
        sc.close();
    }
    
}
