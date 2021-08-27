package Java.Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		linkedHashMap.put(1, new String("Honor"));
		linkedHashMap.put(1, new String("RedMI"));
		linkedHashMap.put(1, new String("samsung"));
		linkedHashMap.put(1, new String("realme"));
		linkedHashMap.put(1, new String("Honor"));
		linkedHashMap.put(1, new String("apple"));

		System.out.println("Contents of linkedhashmap : " + linkedHashMap);
		System.out.println("\nVariables of map after iterating over it :");

		for (Integer key : linkedHashMap.keySet()) {
			System.out.println(key + ":\t" + linkedHashMap.get(key));
		}

		System.out.println("\n The size of the LinkedHashMap is : " + linkedHashMap.size());


	}

}
