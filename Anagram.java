import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramGroups {
    public static int countAnagramGroups(String[] strs) {
        if (strs == null || strs.length == 0) {
            return 0;
        }

        Map<String, Integer> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedKey = new String(charArray);
          
            map.put(sortedKey, map.getOrDefault(sortedKey, 0) + 1);
        }
        return map.size();
    }

    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        int totalGroups = countAnagramGroups(strs);
        System.out.println("Total Anagram Groups: " + totalGroups); // Output: 3
    }
}
