import java.util.*;
public class Smallest {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the three number a,b,c:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a<b)&&(a<c)){
            System.out.println("Is the first number the smallest? YES");
            return;
        }
        else{
            System.out.println("Is the first number the smallest? NO");
        }
    
}
}
