import java.util.*;
public class Grade {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        float mat,phy,chem;
        System.out.println("Enter marks in Maths:");
        mat=sc.nextFloat();
        System.out.println("Enter marks in Physics:");
        phy=sc.nextFloat();
        System.out.println("Enter marks in Chemistry:");
        chem=sc.nextFloat();
        float avg;
        avg=((mat+phy+chem)/3);
        if(avg>0){
            if(avg>=80){
                System.out.println(avg);
                System.out.println("Grade:A");
                System.out.println("Remarks:Level 4,above agency-normalized standards");
            }
            else if((avg>=70&&avg<=79)){
                System.out.println(avg);
                System.out.println("Grade:B");
                System.out.println("Remarks:Level 3,at agency-normalized standards");
            }
            else if((avg>=60&&avg<=69)){
                System.out.println(avg);
                System.out.println("Grade:C");
                System.out.println("Remarks:Level 2,below,but approaching agency-normalized standards");
            }
            else if((avg>=50&&avg<=59)){
                System.out.println(avg);
                System.out.println("Grade:D");
                System.out.println("Remarks:Level 1,well below agency-normalized standards");
            }
            else if((avg>=40&&avg<=49)){
                System.out.println(avg);
                System.out.println("Grade:E");
                System.out.println("Remarks:Level 1-,too below agency-normalized standards");
            }
            else{
                System.out.println(avg);
                System.out.println("Grade:R");
                System.out.println("Remarks:Remedial standards");
            }

        }
        else{
            System.out.println("Invalid inputs");
        }
        sc.close();

    }
    
}
