package Ch01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Work4 {
    public static void main(String[] args) {
        List<Object> objects = new ArrayList<Object>();
        objects.add("Hello");
        objects.add(LocalDate.now());
        objects.add(3);
        System.out.println(objects);

    }
}
