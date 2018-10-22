package others.ComparableInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Thing> things = new ArrayList<>();
        for (int i = 0; i < 10; i++ ) {
            things.add(new Thing());
        }

        things.forEach(System.out::println);

        System.out.println("==================================");
        Collections.sort(things);

        things.forEach(System.out::println);


    }
}
