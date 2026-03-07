import java.util.*;
public class Count {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number,rem,n=0;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        if(number>0){
            while(number>0){
                rem=number%10;
                n++;
                number/=10;
            }
            System.out.println("The number of digits in give number is: "+n);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
