import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Collect {
	public static void main(String[] args) {
		// Fisrt part of Collect assignment.
		// Use Set to find unique elements of a List.
		List<String> list = Arrays.asList("dog", "dog", "cat", "duck", "pig");
		System.out.println(list);

		Set<String> hashSet = new HashSet<String>(list);
		System.out.println(hashSet);

		// Second part of the Collect assignment
		// Show an example of HashMap and a TreeMap, and explain the difference.
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		hashMap.put("f", 5);
		hashMap.put("j", 8);
		hashMap.put("w", 435);
		hashMap.put("u", 32);

		System.out.println("HashMap: ");
		for (String s : hashMap.keySet()) {
			String key = s.toString();
			String value = hashMap.get(s).toString();
			System.out.println(key + " " + value);
		}

		Map<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("f", 5);
		treeMap.put("j", 8);
		treeMap.put("w", 435);
		treeMap.put("u", 32);

		System.out.println("HashMap: ");
		for (String s : treeMap.keySet()) {
			String key = s.toString();
			String value = treeMap.get(s).toString();
			System.out.println(key + " " + value);
		}

	}

}