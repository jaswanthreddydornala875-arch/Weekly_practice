import java.util.*;
public class GreatestFac2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,greatestfac=1,i;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        i=n-1;
        if(n>0){
            while(i>0){
                if((n%i==0)){
                    if((i>greatestfac)){
                        greatestfac=i;
                        break;
                    }
                }
                i--;
            }
        }
        System.out.println("The Greatest Factor of "+n+" is "+greatestfac);
        sc.close();
    }
    
}
