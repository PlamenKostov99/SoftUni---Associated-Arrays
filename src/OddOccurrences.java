import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        LinkedHashMap<String, Integer> count = new LinkedHashMap<>();

        for (String word : words) {

            String wordInLowerCase = word.toLowerCase();

            if (count.containsKey(wordInLowerCase)) {

                count.put(wordInLowerCase, count.get(wordInLowerCase) + 1);
            } else {

                count.put(wordInLowerCase, 1);
            }

        }

        ArrayList<String> oddWords = new ArrayList<>();

        for (var entry : count.entrySet()) {

            if (entry.getValue() % 2 == 1) {

                oddWords.add(entry.getKey());

            }

        }

        for (int i = 0; i < oddWords.size() ; i++) {

            System.out.print(oddWords.get(i));
            if (i < oddWords.size() - 1){

                System.out.print(", ");

            }
            
        }
    }
}
