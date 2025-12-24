import java.util.Scanner;

public class ReplaceWord {
    // method to replace words in a string
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        int i = 0;

        while (i < sentence.length()) {
            if (i + oldWord.length() <= sentence.length()
                    && sentence.substring(i, i + oldWord.length()).equals(oldWord)) {
                result += newWord;
                i += oldWord.length();
            } else {
                result += sentence.charAt(i);
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();

        System.out.print("Word to replace: ");
        String oldWord = input.next();

        System.out.print("New word: ");
        String newWord = input.next();

        System.out.println("Modified Sentence:");
        System.out.println(replaceWord(sentence, oldWord, newWord));
    }
}
