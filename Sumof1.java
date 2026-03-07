import java.util.*;
public class Sumof1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double n;
        double sum=0;
        System.out.println("Enter numbers:");
        n=sc.nextDouble();
        while(n!=0){
            sum=sum+n;
            n=sc.nextDouble();
        }
        System.out.println("The total sum is: "+sum);
        sc.close();

    }
}