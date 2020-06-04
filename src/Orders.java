import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String, Double> orders = new LinkedHashMap<>();
        LinkedHashMap<String, Integer> rememberProducts = new LinkedHashMap<>();

        String input = "";

        while (!"buy".equals(input = scanner.nextLine())) {

            String[] data = input.split("\\s+");

            String product = data[0];
            double price = Double.parseDouble(data[1]);
            int quantity = Integer.parseInt(data[2]);

            if (!orders.containsKey(product)) {

                orders.put(product, quantity * price);
                rememberProducts.put(product, quantity);

            } else {

                rememberProducts.put(product, rememberProducts.get(product) + quantity);
                orders.put(product, rememberProducts.get(product) * price);

            }
        }

        orders.forEach((key, value) ->
                System.out.println(String.format("%s -> %.2f", key, value)));

    }
}

