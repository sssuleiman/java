import java.util.Scanner;
  class name{
      public static void main (String []args){
          Scanner scanner = new Scanner (System.in);
          System.out.println("Enter your first name");
          String firtName = scanner.nextLine();

          System.out.println("Enter your last name");
          String lastName = scanner.nextLine();
          System.out.println ("what is ur age");
          int age = scanner.nextInt();

        
          System.out.println("Welcome " + firtName + " " + lastName + "!" );
      }  
      
  }
