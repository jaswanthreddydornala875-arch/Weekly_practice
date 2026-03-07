import java.util.*;
public class LeapYear2 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int year;
        System.out.println("Enter a year:");
        year=sc.nextInt();
        if(year>=1582){
            if((year%4==0&&year%10!=0)||(year%400==0)){
                System.out.println("It is a leapYear");
                return;
            }
            System.out.println("It is not a LeapYear");
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
    
}
