import java.util.*;
public class Power2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int number,power,result=1;
        int pow;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        System.out.println("Enter the power:");
        power=sc.nextInt();
        pow=power;
        while(power>0){
            result*=number;
            power--;
        }
        System.out.println(number+" power of "+pow+" is "+result);
        sc.close();
    }
    
}
