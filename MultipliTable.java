import java.util.*;
public class MultipliTable {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter a number:");
        n=sc.nextInt();
        for(int i=6;i<=9;i++){
            System.out.println(String.format("%d * %d = %d",n,i,n*i));
        }
        sc.close();
    }
    
}
