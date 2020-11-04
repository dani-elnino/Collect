import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collect {
	public static void main(String[] args) {
		//Fisrt part of Collect assignment.
		//Use Set to find unique elements of a List.
		List<String> list = Arrays.asList("dog", "dog", "cat", "duck", "pig");
		System.out.println(list);
		
		Set<String> hashSet = new HashSet<String>(list);
		System.out.println(hashSet);

		 
	}
	
}