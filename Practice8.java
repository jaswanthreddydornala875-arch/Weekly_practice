import java.util.*;
public class Practice8 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double km;
        km=sc.nextDouble();
        double mile=(km*1.6);
        System.out.println(String.format("The total miles is %.3f mile fot the give %.3f km",mile,km));
        sc.close();

    }
    
}
