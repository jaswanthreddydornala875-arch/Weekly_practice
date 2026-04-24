import java.util.*;
public class Odd_Even {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int number = sc.nextInt();
        int even[]=new int[(number/2)+1];
        int odd[]=new int[(number/2)+1];
        int i=1;
        int j=0;
        int k=0;
    if(number>0){
        while(i<=number){
            if(i%2==0){
                even[j]=i;
                j++;
            }
            else{
                odd[k]=i;
                k++;
            }
            i++;
        }
    }
    System.out.println("Even Numbers:");
    for(i=0;i<even.length;i++){
        System.out.println(even[i]);
    }
    for(i=0;i<odd.length;i++){
        System.out.println(odd[i]);
    }

    }   
}
