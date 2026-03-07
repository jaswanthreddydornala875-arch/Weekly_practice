import java.util.*;
public class Prime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,count=2;
        boolean isPrime=true;
        System.out.println("Enter a number to check:");
        n=sc.nextInt();
        if(n>=1){
            for(int i=2;i<n;i++){
                if(n%i==0){
                    count++;
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("It is a prime number.");
            }
            else{
                System.out.println("It is not a prime number.");
            }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

    }
    
}
