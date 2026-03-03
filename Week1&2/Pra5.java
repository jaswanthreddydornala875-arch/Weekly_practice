import java.util.*;
public class Pra5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int quantity;
        float unitprice;
        System.out.println("Enter quantity:");
        quantity=sc.nextInt();
        System.out.println("Enter unit price:");
        unitprice=sc.nextFloat();
        System.out.println(String.format("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f",(quantity*unitprice),quantity,unitprice));
        sc.close();
    }
    
}
