//  If the random letters do not contain a vowel (a,e,i,o,u) display the letters followed by "is not a word."
//  Otherwise display the word followed by "might be a word
// Use a while loop to allow the user to select another word

package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);

        System.out.println("Hello welcome to the alphabet game!");

        Random rand = new Random();
        String answer;


// Create an array containing 26 letters of alphabet.
        String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n"
                , "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

        do {

// Prompt user for the length of the word.
        System.out.println("Please enter length of word");
        int userInput = Keyboard.nextInt();


            String randomWord = "";
// Select number of random letters required to create a word of that length
            for (int i = 0; i < userInput; i++) {
                int word = rand.nextInt(alphabet.length);
                System.out.print(alphabet[word]);
                randomWord += alphabet[word];
            }

//  If the random letters do not contain a vowel (a,e,i,o,u) display the letters followed by "is not a word."
//    String [] vowel= new String[]{"aeoiu"};

            if ((randomWord.equalsIgnoreCase("a")) || (randomWord.equalsIgnoreCase("e")) ||
                    (randomWord.equalsIgnoreCase("i")) || (randomWord.equalsIgnoreCase("o"))
                    || (randomWord.equalsIgnoreCase("u"))) {
                System.out.println("Is not a word!");
            } else {
                System.out.println("Might be a word");
            }

        System.out.println("Do you want to play again?");
        answer = Keyboard.next();
    }
        while(answer.equalsIgnoreCase("Yes"));
        System.out.println("Thanks for playing!");

    }
    }

//
