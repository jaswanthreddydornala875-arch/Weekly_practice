import java.util.*;
public class Pra7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter value of a:");
        a=sc.nextInt();
        System.out.println("Enter value of b:");
        b=sc.nextInt();
        System.out.println("Enter value of c:");
        c=sc.nextInt();
        int ans1=a+b*c;
        int ans2=a*b+c;
        int ans3=c+a/b;
        int ans4=a%b+c;
        System.out.println(String.format("The result of Int Operations are %d, %d, %d and %d",ans1,ans2,ans3,ans4));
        sc.close();
    }
    
}
