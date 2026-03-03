import java.util.*;
public class Pr8 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float pri,rate,time,si;
        System.out.println("Enter the principal:");
        pri=sc.nextFloat();
        System.out.println("Enter Rate of interest:");
        rate=sc.nextFloat();
        System.out.println("Enter the time period:");
        time=sc.nextFloat();
        si=(pri*rate*time)/(100f);
        System.out.println(String.format("The Simple Interest is %.2f for principal %.2f , Rate of Interest %.2f and the Time %.2f",si,pri,rate,time));
        sc.close();
    }
    
}
