import java.util.*;
public class Largest {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        float a,b,c;
        System.out.println("Enter the three number a,b,c:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("Is the first number the Largest? YES");
            System.out.println("Is the second number the Largest? NO");
            System.out.println("Is the third number the Largest? NO");
            return;
        }
        else if (b>c){
            System.out.println("Is the first number the Largest? NO");
            System.out.println("Is the second number the Largest? YES");
            System.out.println("Is the third number the Largest? NO");
            return;
        }
        else{
            System.out.println("Is the first number the Largest? NO");
            System.out.println("Is the second number the Largest? NO");
            System.out.println("Is the third number the Largest? YES");
        }
        sc.close();
    
    }
}


    

