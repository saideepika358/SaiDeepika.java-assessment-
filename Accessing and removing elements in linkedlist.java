import java.util.LinkedList;

public class LinkedListOperations {
    public static void main(String[] args) {
        LinkedList<String> items = new LinkedList<>();

        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");
        items.add("Date");

        String firstItem = items.getFirst();
        String lastItem = items.getLast();
        String secondItem = items.get(1);

        System.out.println("First item: " + firstItem);
        System.out.println("Last item: " + lastItem);
        System.out.println("Item at index 1: " + secondItem);

        items.removeFirst();
        items.removeLast();
        items.remove("Banana");

        for (String item : items) {
            System.out.println("Remaining item: " + item);
        }
    }
}
