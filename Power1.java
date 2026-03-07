import java.util.*;
public class Power1 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int number,power,result=1;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        System.out.println("Enter the power:");
        power=sc.nextInt();
        for(int i=1;i<=power;i++){
            result*=number;
        }
        System.out.println(number+" power of "+power+" is "+result);
        sc.close();
    }
    
}
