package root.lesson2_references;

/**
 * Java passes arguments as a copy.
 * So, you cannot change reference of object from another function.
 */

public class Main {
    public static void main(String[] args) {
        // Create an object
        Object obj = new Object();
        // Make a copy of it
        Object obj2 = obj;

        fun(obj);

        // Print references
        System.out.println("Result obj = obj2 ? " + (obj == obj2));
    }

    public static void fun(Object obj) {
        obj = new Object();
        System.out.println("1: " + obj);
    }
}
