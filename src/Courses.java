import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, ArrayList<String>> courses = new LinkedHashMap<>();


        String input = "";

        while (!"end".equals(input = scanner.nextLine())) {

            String[] data = input.split(" : ");

            String course = data[0];
            String names = data[1];

            if (!courses.containsKey(course)) {

                courses.put(course, new ArrayList<>());
                courses.get(course).add(names);

            } else {
                courses.get(course).add(names);
                Collections.sort(courses.get(course));
            }

        }

        courses.entrySet().stream().sorted((e1, e2) ->
                Integer.compare(e2.getValue().size(), e1.getValue().size())).forEach(entry -> {
            System.out.println(String.format("%s: %d", entry.getKey(), entry.getValue().size()));

            for (int i = 0; i < entry.getValue().size(); i++) {
                System.out.println("-- " + entry.getValue().get(i));
            }

        });
    }
}
