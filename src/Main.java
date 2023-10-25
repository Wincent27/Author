import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        arrLEx();

    }

    private static void arrLEx() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Author> aut = new ArrayList<Author>();

        for (int i = 0; i < 3; i++) {
            System.out.println("Skriv ut namn: ");
            String name = scan.nextLine();

            System.out.println("Skriv ut Email: ");
            String email = scan.nextLine();

            System.out.println("Skriv ut kön M/F: ");
            char gender = scan.nextLine().charAt(0);

            Author au = new Author(name, email, gender);
            aut.add(au);

            
        }

        System.out.println("Vilken författar vill du jobba med? ");
        for (int i = 0; i < 3; i++) {
            Author au = aut.get(i);
            System.out.println(au.getName() + ", " + au.getEmail() + " (" + au.getGender() + ")");
        }
    }
}