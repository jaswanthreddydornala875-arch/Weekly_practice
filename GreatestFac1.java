import java.util.*;
public class GreatestFac1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,greatestfac=1;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>0){
            for(int i=n-1;i>1;i--){
                if((n%i==0)){
                    if((i>greatestfac)){
                        greatestfac=i;
                    }
                }
            }
        }
        System.out.println("The Greatest Factor of "+n+" is "+greatestfac);
        sc.close();
    }
    
}
