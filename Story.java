import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = keyboard.next();

        System.out.print("Give me an adjective! ");
        String adjective = keyboard.next();

        System.out.print("Give me a noun! ");
        String noun = keyboard.next();

        System.out.print("Give me a plural noun! ");
        String pluralNoun1 = keyboard.next();

        System.out.print("Another plural noun! ");
        String pluralNoun2 = keyboard.next();

        System.out.println("\nParagraph from " + name + " in Wonderland:\n");

        System.out.println(name + " was beginning to get very " + adjective + " of sitting by her " + noun + " on the bank, and of having nothing to do: once or twice she had peeped into the book her " + noun + " was reading, but it had no " + pluralNoun1 + " or " + pluralNoun2 + " in it, “and what is the use of a book,” thought " + name + " “without " + pluralNoun2 + " or " + pluralNoun2 + "?”\n");
    }
}