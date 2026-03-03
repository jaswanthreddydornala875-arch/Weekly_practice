import java.util.*;
public class Divisible {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println("Enter a number:");
        num=sc.nextFloat();
        if(num%5==0){
            System.out.println(String.format("Is the number %.2f divisible by 5? YES",num));
        }
        else{
            System.out.println(String.format("Is the number %.2f divisible by 5? NO",num));
        }
        sc.close();

    }
    
}
