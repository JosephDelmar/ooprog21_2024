import java.util.Scanner;

public class Spoonerism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Word 1: ");
        String word1 = scanner.nextLine().trim();
        System.out.print("Word 2: ");
        String word2 = scanner.nextLine().trim();

        
        if (startsWithVowel(word1) || startsWithVowel(word2)) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String spoonerizedWord1 = word2.charAt(0) + word1.substring(1);
            String spoonerizedWord2 = word1.charAt(0) + word2.substring(1);

            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }

        scanner.close();
    }

    private static boolean startsWithVowel(String word) {
        
        char firstChar = word.toLowerCase().charAt(0);
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }
}
