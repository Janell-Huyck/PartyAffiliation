//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// require Scanner
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //declare variables
        String userParty;

        // initialize Scanner
        Scanner in = new Scanner(System.in);

        // collect the user's party affiliation
        System.out.print("What is your party affiliation (D/R/I): ");

        // assign the user input to userParty
        userParty = in.nextLine();

        // use cascading if/else statements to return an output about their party
        if (userParty.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        } else if (userParty.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        } else if (userParty.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            System.out.println("You get an Other Otter.");
        }
    }
}
