import java.util.*;
public class Pr9 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float pounds,kilo;
        System.out.println("Enter weight in Pounds:");
        pounds=sc.nextFloat();
        kilo=(pounds/2.2f);
        System.out.println(String.format("The weight of the person in pounds is %.2f and in kg is %.2f",pounds,kilo));
        sc.close();
    }
    
}
