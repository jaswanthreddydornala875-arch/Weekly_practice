import java.util.*;
public class Pra3 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float side;
        System.out.println("Enter side of a square:");
        side=sc.nextFloat();
        float peri=(side*4);
        System.out.println(String.format("The length of the side is %.2f whose perimeter is %.2f",side,peri));
        sc.close();


    }
    
}
