public class Practice6 {
    public static void main(String[]args){
        double fee =125000;
        double dis = (fee*0.1);
        double total = fee - dis;
        System.out.println(String.format("The discount amount is INR %.2f and final discounted fee is INR %.2f",dis,total));
    }
    
}