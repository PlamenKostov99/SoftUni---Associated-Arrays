import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            words.putIfAbsent(word,new ArrayList<>());
            words.get(word).add(synonym);

        }

        String pattern = "%s - %s";

        for (Map.Entry<String,ArrayList<String>> entry : words.entrySet()) {


            System.out.println(String.format(pattern, entry.getKey(),String.join(", ",entry.getValue())));

        }
    }
}
