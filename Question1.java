import java.util.Scanner;
  class Question1{
      public static void main(String [] args){
          Scanner input = new Scanner(System.in);
            /*NAME */
             System.out.println("Enter your name");
              String name = input.nextLine();

               /*AGE */ 
               System.out.println("Enter your age");
                int age = input.nextInt();

                  /*NAME OF THE CITY*/
                    System.out.println("Enter your city");
                     String city = input.nextLine();

               /*NAME OF A COLLEGE */
            System.out.println("Enter your college");
        String college = input.nextLine();
                
     /*PROFESSION */
  System.out.println("Enter your Profession");
 String Prof = input.nextLine();

 /*TYPE OF ANIMAL */
System.out.println("Enter your Animal");
String Animal = input.nextLine();

 /*PET'S NAME */
     System.out.println("Enter your pet's name");
         String Mypets = input.nextLine();

                 System.out.print("There once was a person named " + name );
                 System.out.print(" who lived in " + city) ;
                 System.out.print(".At the age of " + age);
                 System.out.print("," + name +" went to college at. " + college);
                 System.out.print( name +" graduated and went to work as a ");
                 System.out.print(Prof +". Then,");
                 System.out.print(name + " adopted a(n) ");
                 System.out.print(Animal + " named " ); 
                 System.out.print( Mypets + " They both lived happily ever after!");

         }



  }