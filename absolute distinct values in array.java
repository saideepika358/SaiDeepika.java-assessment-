import java.util.*;

public class Main {
    public static int countDistinctAbsoluteValues(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            set.add(Math.abs(num));
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {-5, 2, -2, 5, 5, 0};

        System.out.println(countDistinctAbsoluteValues(arr));
    }
}
