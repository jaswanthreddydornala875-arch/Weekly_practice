import java.util.*;
public class Sumof2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double n,sum=0;
        System.out.println("Enter numbers to add:");
        while(true){
            n=sc.nextDouble();
            if(n<0||n==0){
                break;
            }
            sum+=n;
        }
        System.out.println("The sum of number is: "+sum);
        sc.close();
    }
    
}
