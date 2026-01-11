package javaProgramiz;

public class PermutationExamples {

    // String is defined here, NOT in main()
    static String str = "ABC";

    public static void main(String[] args) {
        printPermutations(str, "");
    }

    public static void printPermutations(String remaining, String permutation) {
        if (remaining.length() == 0) {
            System.out.println(permutation);
            return;
        }

        for (int i = 0; i < remaining.length(); i++) {
            char current = remaining.charAt(i);
            String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

            printPermutations(newRemaining, permutation + current);
        }
    }
}
