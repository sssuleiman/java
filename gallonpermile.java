import java.util.Scanner;

public class gallonpermile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number of miles: ");
        double miles = input.nextDouble();
        
        System.out.println("Enter price of gas per gallon: ");
        double price = input.nextDouble();
        
        System.out.println("Enter number of gallon of gas: ");
        double gallon = input.nextDouble();
        
        double GPM = (miles * gallon);
        double POT = (250 * price);
        System.out.println("The car can travel in Miles per gallon is: " + GPM +"milesppergallon");
        System.out.println("The cost of travel in 250Miles is: " + POT );
    }
}
