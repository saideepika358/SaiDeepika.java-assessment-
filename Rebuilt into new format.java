import java.util.Scanner;

class Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();

        String[] words = s.split(" ");

        System.out.println("Words:");
        for (String w : words)
            System.out.println(w);

        String newSentence = String.join("-", words);

        System.out.println("New format: " + newSentence);
    }
}
