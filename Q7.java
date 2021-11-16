import java.util.Scanner;
 class Q7{
     public static void main(String [] args){
         Scanner input = new Scanner(System.in);

        System.out.println("Enter number of miles");
        int m = input.nextInt();

        System.out.println("Gallons of gas ");
        int g= input.nextInt();

        int Miles = m/g;
        System.out.println("Result  " + Miles);
        int No_of_gallons = g/m;
        
        System.out.println("Result  " + No_of_gallons );
    
    
        
          
        
     }
 }