import java.util.*;
public class Pra8 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter value of a:");
        a=sc.nextDouble();
        System.out.println("Enter value of b:");
        b=sc.nextDouble();
        System.out.println("Enter value of c:");
        c=sc.nextDouble();
        double ans1=a+b*c;
        double ans2=a*b+c;
        double ans3=c+a/b;
        double ans4=a%b+c;
        System.out.println(String.format("The result of Int Operations are %.3f, %.3f, %.3f and %.3f",ans1,ans2,ans3,ans4));
        sc.close();

    }
    
}
