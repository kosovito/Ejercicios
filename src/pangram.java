/*
Your task is to figure out if a sentence is a pangram.

A pangram is a sentence using every letter of the alphabet at least once. It is case insensitive, so it doesn't matter if a letter is lower-case (e.g. k) or upper-case (e.g. K).

For this exercise we only use the basic letters used in the English alphabet: a to z.
* */
public class pangram {
    public static void main(String[] args) {
        String frase = "\"Five quacking Zephyrs jolt my wax bed.\"";
        System.out.println(""+isPangram(frase));


    }

    public static boolean isPangram(String input) {
        final int LETTERS_IN_ALPHABET = 26;
        return input.toLowerCase().chars()
                .filter(Character::isAlphabetic)
                .distinct()
                .count() == LETTERS_IN_ALPHABET;
    }
}