import java.util.ArrayList;

public class TodoListManager {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Pay electricity bill");
        tasks.add("Clean the room");
        tasks.add("Schedule doctor appointment");

        tasks.remove("Clean the room");
        tasks.remove(1);

        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
