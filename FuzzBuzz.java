import java.util.*;
public class FuzzBuzz {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String arr[]=new String[num+1];
        int i=0;
        while(i<=num){
            if(i%3==0 && i%5==0 && i!=0){
                arr[i]="FizzBuzz";
            }
            else if(i%3==0 && i!=0){
                arr[i]="Fizz";
            }
            else if(i%5==0 && i!=0){
                arr[i]="Buzz";
            }  
            else{
                int val=i;
                arr[i]=String.valueOf(val);
            }   
            i++;   
        }
        for(i=0;i<num;i++){
            System.out.println(arr[i]);
        }
    }
    
}
