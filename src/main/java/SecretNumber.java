import java.util.Scanner;

public class SecretNumber {

    public static void main(String[] args) {

//        create a variable with a secret number
        int secretNumber = 64;

//        request a user to input a number
        System.out.println("Guess a secret number:");
        Scanner reader = new Scanner(System.in); // creating a scanner object

//        collect user input
        int guessNumber = Integer.parseInt(reader.nextLine());

//        check if the user input matches the secret number:
//          report if the incorrect guess was too high
//          report if the incorrect guess was too low
//          report if the user guessed the number correctly

    }

}
