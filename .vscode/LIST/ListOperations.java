import java.util.*;

public class ListOperations {
    public static void main(String[] args) {

        // ----------- ArrayList -----------
        ArrayList<String> al = new ArrayList<>();

        // Add elements
        al.add("Apple");
        al.add("Banana");
        al.add("Mango");
        System.out.println("ArrayList: " + al);

        // Insert at specific position
        al.add(1, "Orange");
        System.out.println("After Insert: " + al);

        // Access element
        System.out.println("Element at index 2: " + al.get(2));

        // Update element
        al.set(2, "Grapes");
        System.out.println("After Update: " + al);

        // Remove element
        al.remove("Banana");
        System.out.println("After Remove: " + al);

        // Search element
        System.out.println("Contains Apple? " + al.contains("Apple"));

        // Size
        System.out.println("Size: " + al.size());

        // Iterate
        System.out.println("ArrayList Elements:");
        for (String item : al) {
            System.out.println(item);
        }

        // ----------- LinkedList -----------
        LinkedList<String> ll = new LinkedList<>();

        // Add elements
        ll.add("Car");
        ll.add("Bike");
        ll.add("Bus");
        System.out.println("\nLinkedList: " + ll);

        // Insert at position
        ll.add(1, "Train");
        System.out.println("After Insert: " + ll);

        // Add first & last
        ll.addFirst("Auto");
        ll.addLast("Flight");
        System.out.println("After addFirst/addLast: " + ll);

        // Access
        System.out.println("First Element: " + ll.getFirst());
        System.out.println("Last Element: " + ll.getLast());

        // Update
        ll.set(2, "Metro");
        System.out.println("After Update: " + ll);

        // Remove
        ll.remove("Bike");
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After Remove: " + ll);

        // Search
        System.out.println("Contains Bus? " + ll.contains("Bus"));

        // Size
        System.out.println("Size: " + ll.size());

        // Iterate
        System.out.println("LinkedList Elements:");
        for (String item : ll) {
            System.out.println(item);
        }
    }
}