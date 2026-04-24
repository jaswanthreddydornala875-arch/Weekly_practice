import java.util.*;
public class Factor{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int max=10;
        int fact[]=new int[max];
        int k=0;
        for(int i=1;i<=num;i++){
            if(num%i==0 && k<max){
                fact[k]=i;
                k++;
            }
            if(k>=max){
                max*=2;
                int temp[]=new int[max];
                temp=fact.clone();
            }
        }
        for(int i=0;i<fact.length;i++){
            System.out.println(fact[i]);
        }
    }
    
}
