import java.util.*;
public class BMI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double height,weight,index;
        System.out.println("Enter Height in Cm's:");
        height=sc.nextDouble();
        System.out.println("Enter Weight in Kg's");
        weight=sc.nextDouble();
        height/=100;
        index=weight/(height*height);
        if(index>0){
            if(index>=40.0){
                System.out.println("Obese");
            }
            else if((index>=25.0&&index<=39.9)){
                System.out.println("OverWeight");
            }
            else if((index>=18.5&&index<=24.9)){
                System.out.println("Normal");
            }
            else{
                System.out.println("UnderWeight");
            }
        }
        else{
            System.out.println("Invalid inputs");
        }
        sc.close();
    }
    
}
