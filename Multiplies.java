import java.util.*;
public class Multiplies {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);  
        int number,i;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        for(i=100;i>=1;i--){
            if(i%number==0){
                System.out.println("The multiplies of the number "+number+" is "+i);
                continue;
            }
        }
        sc.close();
    }
}
