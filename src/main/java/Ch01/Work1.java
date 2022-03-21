package Ch01;

import java.util.ArrayList;
import java.util.List;

public class Work1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("World");
// strings.add(new Date());
// Integer i = strings.get(0);
        for (String s : strings) {
            System.out.printf("%s has length %d%n", s, s.length());
        }
    }

}
