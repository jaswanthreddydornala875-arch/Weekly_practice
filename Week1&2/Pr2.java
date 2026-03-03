import java.util.*;
public class Pr2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float fah;
        System.out.println("Enter temperature:");
        fah=sc.nextFloat();
        float cel;
        cel=(fah-32)*(5/9f);
        System.out.println(String.format("The %.2f fahernheit is %.2f celsius",fah,cel));
        sc.close();
    }
    
}
