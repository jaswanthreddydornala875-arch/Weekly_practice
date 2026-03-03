public class Practice4 {
    public static void main(String[] args){
        float cp=129;
        float sp=191;
        float profit =sp-cp;
        double per=(profit/cp)*100;
        System.out.print(String.format("The Cost Price is INR %.2f and Selling Price is %.2f \nThe Profit is INR %.2f and the Profit Percentage is %.2f",cp,sp,profit,per));
    }
    
}
