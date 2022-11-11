package root.lesson1_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * Iterator in Java
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("lemon", "apple", "pear"));
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("apple")) {
                iterator.remove();
            }
        }

        names.forEach(System.out::println);
    }
}
