import java.util.LinkedHashMap;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashMap<String , Integer> resouces =  new LinkedHashMap<>();


        String input = "";

        while(!"stop".equals(input =scanner.nextLine())){

            String resource = input;
            int quantity = Integer.parseInt(scanner.nextLine());

            if (!resouces.containsKey(resource)){

                resouces.put(resource,quantity);

            }else{
                resouces.put(resource,resouces.get(resource) + quantity);

            }
        }

        resouces.entrySet().forEach(e -> {
            System.out.println(String.format("%s -> %d",e.getKey(),e.getValue()));
        });

    }
}
