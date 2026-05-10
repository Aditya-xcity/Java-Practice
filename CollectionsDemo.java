// Practice program: basic Collections usage (ArrayList, HashSet, HashMap)

import java.util.*;

public class CollectionsDemo
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("apple");

        Set<String> set = new HashSet<>(list);

        Map<String, Integer> counts = new HashMap<>();
        for (String s : list) counts.put(s, counts.getOrDefault(s, 0) + 1);

        System.out.println("List: " + list);
        System.out.println("Set (unique): " + set);
        System.out.println("Counts: " + counts);
    }
}
