import java.util.*;
public class Pr7 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int noch,noc;
        System.out.println("Enter number of Children:");
        noc=sc.nextInt();
        System.out.println("Enter number of chocolates:");
        noch=sc.nextInt();
        int each,rem;
        each=(noch/noc);
        rem=(noch%noc);
        System.out.println(String.format("The number of chocolates each child get is %d and the number of remaining chocolates are %d",each,rem));
        sc.close();

    }

    
}
