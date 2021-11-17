import java.util.Scanner;
class word_game {
    public static void main (String [] args ) {
        Scanner scanner= new Scanner (System.in);

        System.out.println ("what is ur name: ");
        String name = scanner.nextLine();

        System.out.println ("what is ur type of animal: ");
        String petname = scanner.nextLine();

        

        System.out.println ("what is ur proffesional: ");
        String proffesional = scanner.nextLine();

        System.out.println ("what is ur city: ");
        String city = scanner.nextLine();

        System.out.println ("what is ur collage: ");
        String collage = scanner.nextLine();

        System.out.println ("what is ur age");
        int age = scanner.nextInt();

        System.out.println ("there once was a person named" + name + "who lived in " + city + ".At the age of " + age + "," + name + "went to collage at "+ collage + "." + name + " graduated and went to work as " + proffesional + ". Then, " + name + "adopted a(n) Animal named" + petname + ". They both lived happily ever after!" );

    }
}
