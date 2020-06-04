import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] nums = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        TreeMap<Double,Integer> count = new TreeMap<>();

        for (double num : nums) {

            if (!count.containsKey(num)){
                count.put(num,0);
            }

            count.put(num,count.get(num)+1);
            
        }

        String pattern = "%.0f -> %d";

        for (Map.Entry<Double,Integer> entry : count.entrySet()) {

            System.out.println(String.format(pattern,entry.getKey(),entry.getValue()));

            
        }
    }
}
