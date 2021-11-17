import java.util.Scanner;
class Word_game {
    public static void main (String [] args ) {
        Scanner scanner= new Scanner (System.in);

        System.out.println ("what is ur name: ");
        String name = scanner.nextLine();

        System.out.println ("what is ur type of animal: ");
        String animal_type = scanner.nextLine();

        System.out.println ("Enter Pet's name: );
        String petname = scanner.next();

        System.out.println ("what is ur proffesional: ");
        String proffesional = scanner.nextLine();

        System.out.println ("what is ur city: ");
        String city = scanner.nextLine();

        System.out.println ("what is ur collage: ");
        String collage = scanner.nextLine();

        System.out.println ("what is ur age");
        int age = scanner.nextInt();
                            
        /*
            Adding printf to display an output.
        */
        System.out.printf("There once was a person named %s who lived in %s. At the age of %d, %s went to college at %s. %s graduated and went to work as %s. Then %s adopted a(n) %s named %s. They both lived happily ever after!", name, city, age, name, collage, name, professional, name, animal_type, petname);
       // System.out.println ("\n\nthere once was a person named" + name + "who lived in " + city + ".At the age of " + age + "," + name + "went to collage at "+ collage + "." + name + " graduated and went to work as " + proffesional + ". Then, " + name + "adopted a(n) Animal named" + petname + ". They both lived happily ever after!" );

    }
}
