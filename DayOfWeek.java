import java.util.*;
public class DayOfWeek {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m,d,y,y0,m0,x,d0;
        System.out.println("Enter Day:");
        d=sc.nextInt();
        System.out.println("Enter Month:");
        m=sc.nextInt();
        System.out.println("Enter Year:");
        y=sc.nextInt();
            y0=y-(14-m)/12;
            System.out.println(y0);
            x=y0+(y0/4)-(y0/100)+(y0/400);
            System.out.println(x);
            m0=m+12*((14-m)/12)-2;
            System.out.println(m0);
            d0=(d+x+31*m0/12)%7; //mod 7 not m0*d
            System.out.println(d0);
        if((d>0&&d<=31)&&(m>0&&m<13)&&(y>=1582)){
            
                    switch(d0){
                        case 0:
                            System.out.println("Sunday");
                            break;
                        case 1:
                            System.out.println("Monday");
                            break;
                        case 2:
                            System.out.println("Tuesday");
                            break;
                        case 3:
                            System.out.println("Wednesday");
                            break;
                        case 4:
                            System.out.println("Thursday");
                            break;
                        case 5:
                            System.out.println("Friday");
                            break;
                        case 6:
                            System.out.println("Saturday");
                            break;
                        default:
                            System.out.println("Invalid"+d0);
                        }
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();

    }
    
}
