import java.util.*;
public class Pr6{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float s1,s2,s3,per1,per2;
        System.out.println("Enter Side1:");
        s1=sc.nextFloat();
        System.out.println("Enter Side2:");
        s2=sc.nextFloat();
        System.out.println("Enter Side3:");
        s3=sc.nextFloat();
        per1=s1+s2+s3;
        per2=(per1/1000f);
        float total;
        total=(5/per2);
        System.out.println(String.format("The total number of rounds the athlete will run is %.2f to complete 5Km",total));
        sc.close();

    }
}
