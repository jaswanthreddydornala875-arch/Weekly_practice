import java.util.*;
public class Practice10 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float height;
        height=sc.nextFloat();
        float cm=(1/2.54f);
        float inch =(cm*height);
        float feet=(inch/12);
        int feet1 = (int) feet;   
        float inch1=(inch%12);
        int inches=(int)inch1;
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet1+" and inches is "+inches);
        sc.close();



    }
    
}
