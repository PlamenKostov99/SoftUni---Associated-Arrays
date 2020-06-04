import java.util.LinkedHashMap;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, String> registration = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {

            String[] data = scanner.nextLine().split("\\s+");
            String command = data[0];

            switch (command) {
                case "register":

                    String name = data[1];
                    String plateNumber = data[2];


                    if (!registration.containsKey(name)) {
                        registration.put(name, plateNumber);

                        System.out.println(String.format("%s registered %s successfully", name, plateNumber));

                    } else {

                        System.out.println(String.format("ERROR: already registered with plate number %s", plateNumber));
                    }

                    break;
                case "unregister":

                    name = data[1];

                    if (!registration.containsKey(name)) {

                        System.out.println(String.format("ERROR: user %s not found", name));

                    } else {

                        registration.remove(name);
                        System.out.println(String.format("%s unregistered successfully", name));

                    }

                    break;
            }
        }

        registration.forEach((key, value) ->
                System.out.println(String.format("%s => %s", key, value)));

    }
}
