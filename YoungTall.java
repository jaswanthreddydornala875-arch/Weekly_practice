import java.util.*;
public class YoungTall {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int age1,age2,age3;
        double h1,h2,h3;
        System.out.print("Enter age of Amar: ");
        age1=sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        age2=sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        age3=sc.nextInt();
        System.out.print("Enter height of Amar: ");
        h1=sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        h2=sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        h3=sc.nextDouble();
        if((age1<age2)&&(age1<age3)){
            System.out.println("The Youngest is Amar");
        }
        else if((age2<age3)){
            System.out.println("The Youngest is Akbar");
        }
        else{
            System.out.println("The Youngest is Anthony");
        }
        if((h1>h2)&&(h1>h3)){
            System.out.println("The Tallest is Amar");
        }
        else if((h2>h3)){
            System.out.println("The Tallest is Akbar");
        }
        else{
            System.out.println("The Tallest is Anthony");
        }
        sc.close();
    }
    
}

