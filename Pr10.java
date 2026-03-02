import java.util.*;
public class Pr10 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int nofs,max;
        System.out.println("Enter the number of Students:");
        nofs=sc.nextInt();
        max=(nofs*(nofs-1))/2;
        System.out.println(String.format("The maximum number of handshakes is %d",max));
        sc.close();
    }
    
}
