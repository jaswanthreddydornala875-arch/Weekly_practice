public class Pratice7 {
    public static void main(String[]args){
        int ra_km=6378;
        float ra_mile=(ra_km*0.621f);
        double v1=(1.33*Math.PI*Math.pow(ra_km,3));
        double v2=(1.33*Math.PI*Math.pow(ra_mile,3));
        System.out.println(String.format("The volume of the earth in cubic kilometers is %.2f and cubic miles is %.2f",v1,v2));




    }
    
}
