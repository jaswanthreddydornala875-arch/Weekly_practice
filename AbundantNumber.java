import java.util.*;
public class AbundantNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int number,sum=0,n;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        if(number>0){
            for(n=1;n<number;n++){
                if(number%n==0){
                    sum+=n;
                }
            }
            if(sum>number){
                System.out.println("It is a Abundant Number");
            }
            else{
                System.out.println("It is not a Abundant Number");
            }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
