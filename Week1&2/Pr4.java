import java.util.*;
public class Pr4 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        String name,fromCity,viaCity,toCity;
        float fromToVia,viaToFinalCity;
        float fromCitytoViaCity,viaCitytoFinalDestination;
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter From city,Via City and To City:");
        fromCity=sc.nextLine();
        viaCity=sc.nextLine();
        toCity=sc.nextLine();
        System.out.println("Enter distances for fromToVia and ViaToFinalCity");
        fromToVia=sc.nextFloat();
        viaToFinalCity=sc.nextFloat();
        System.out.println("Enter Time for from city to Via city and Via city to final destination in minutes");
        fromCitytoViaCity=sc.nextFloat();
        viaCitytoFinalDestination=sc.nextFloat();
        float time =fromCitytoViaCity+viaCitytoFinalDestination;
        float total=fromToVia+viaToFinalCity;
        System.out.println(String.format("The Total Distance travelled by %s from %s to %s via %s is %.2f km and the Total Time taken is %.2f minutes",name,fromCity,toCity,viaCity,total,time));
        sc.close();
    }
    
}
