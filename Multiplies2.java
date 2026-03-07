import java.util.*;
public class Multiplies2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);  
        int number,i;
        i=100;
        System.out.println("Enter a number:");
        number=sc.nextInt();
        while(i>1){
            if(i%number==0){
                System.out.println("The multiplies of the number "+number+" is "+i);
            }
            i--;
        }
        sc.close();
    }
}
