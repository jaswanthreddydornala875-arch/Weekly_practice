import java.util.*;
public class Pra4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float feet;
        System.out.println("Enter the distance in feet:");
        feet=sc.nextFloat();
        float yard=(1/3f)*feet;
        float mile=(1/760f)*(yard);
        System.out.println(String.format("The distance in yards is %.2f while the distance in miles is %.8f",yard,mile));
        sc.close();

    }
    
}
