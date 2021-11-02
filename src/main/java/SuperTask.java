import java.util.HashMap;
import java.util.Map;

public class SuperTask {

    public static void main (String[] args) {

        // Метод подсчета количества символов (алгорит сортировки подсчетом)

        String str = "Hello world!";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            Integer value = map.get(ch);
            if (value == null) {
                map.put(ch, 1);
            } else {
                map.put(ch, value + 1);
            }
        }

        System.out.println(map);

        System.exit(0);
    }
}
