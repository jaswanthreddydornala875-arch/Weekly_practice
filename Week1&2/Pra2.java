import java.util.*;
public class Pra2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float base,height;
        System.out.println("Enter base of triange:");
        base=sc.nextFloat();
        System.out.println("Enter the height:");
        height=sc.nextFloat();
        float base1,height1;
        float inch=(1/2.54f);
        base1=(base*inch);
        height1=(height*inch);
        float area1=(1/2f)*base*height;
        float area2=(1/2f)*base1*height1;
        System.out.println(String.format("The Area of the triangle in sq in is %.2f and sq cm is %.2f",area2,area1));
        sc.close();

    }
    
}
