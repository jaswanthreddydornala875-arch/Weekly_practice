import java.util.*;
public class Factors2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n,i=1;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>0){
            while(i<=n){
                if((n%i==0)){
                    System.out.println(i+" is a factor of "+n);
                }
                i++;
            }
        }
        sc.close();
    }
    
}
