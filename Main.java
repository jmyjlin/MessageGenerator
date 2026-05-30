import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // scanner object
        Scanner console = new Scanner(System.in);
        // generator object
        Generator generator = new Generator();
        // stores question to show to user
        String question = "Would you like a compliment (c) or insult (i) or fortune (f) or exit (e)? [c/i/f/e]";
        // stores post-question to show to user
        String questionEnd = "Would you like another compliment (c) or insult (i) or fortune (f) or exit (e)? [c/i/f/e]";
        // prints question
        System.out.println(question);
        // user input
        String answer = console.nextLine();




        // while user does not input e
        while (!answer.equals("e")) {
            // if user inputs c
            if (answer.equals("c")) {
                // prints random compliment
                System.out.println(generator.getCompliment());
            }
            // otherwise if user inputs i
            else if (answer.equals("i")) {
                // prints random insult
                System.out.println(generator.getInsult());
            }
            // otherwise if user inputs f
            else if (answer.equals("f")) {
                // prints random fortune
                System.out.println(generator.getFortune());
            }
            // otherwise
            else {
                // tells user to enter a valid choice
                System.out.println("Please enter a valid choice.");
            }
            // blank line (for readability purposes)
            System.out.println();
            // prints post-question
            System.out.println(questionEnd);
            // user input
            answer = console.nextLine();
        }
        // if user exits
        System.out.println("Exited.");
    }
}
