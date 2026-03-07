import java.util.*;
public class Factors {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        if(n>0){
            for(int i=1;i<=n;i++){
                if((n%i==0)){
                    System.out.println(i+" is a factor of "+n);
                }
            }
        }
        sc.close();
    }
    
}
