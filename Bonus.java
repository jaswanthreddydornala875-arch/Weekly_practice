import java.util.*;
public class Bonus {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double sal,bonus;
        int yrs;
        System.out.print("Enter the number of years you worked:");
        yrs=sc.nextInt();
        System.out.print("Enter the salary recieved:");
        sal=sc.nextDouble();
        if(yrs>5){
            bonus=(sal*0.05);
            System.out.println("BONUS AMOUNT IS :"+bonus);
        }
        else{
            System.out.println("NO BONUS IS GIVEN");
        }
        sc.close();

    }
    
}
