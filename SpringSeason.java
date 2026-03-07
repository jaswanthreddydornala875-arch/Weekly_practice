import java.util.*;
public class SpringSeason {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int day,month;
        System.out.println("Enter day:");
        day=sc.nextInt();
        System.out.println("Enter month in number between(1-12):");
        month=sc.nextInt();
        if((day>0&&day<=31)&&(month>0&&month<=12)){
            if(((month==3||month==6)&&(day==20))){
                System.out.println("It is a Spring Season.");
            }
            else if((month>3&&month<6)&&(day>0&&day<=31)){
                System.out.println("It is a Spring Season.");
            }
            else{
                System.out.println("It is not a Spring Season.");
            }
        }
        else{
            System.out.println("Enter valid inputs.");
        }
        sc.close();
    }

    
}
