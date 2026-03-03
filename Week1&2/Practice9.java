import java.util.*;
public class Practice9 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float fee;
        fee=sc.nextFloat();
        float per;
        per=sc.nextFloat();
        per=(per/100);
        float dis=(fee*per);
        float total=(fee-dis);
        System.out.println(String.format("The discount amount is INR %.2f and final discounted fee is INR %.2f",dis,total));
        sc.close();
        

    }
    
}
