import java.util.Scanner;

public class gallonpermile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of miles: ");
        double miles = input.nextDouble();
        System.out.println("Enter number of gallon of gas: ");
        double gallon = input.nextDouble();
        double GPM = (miles / gallon);
        System.out.println("Miles per gallon is: " + GPM);
    }
}
