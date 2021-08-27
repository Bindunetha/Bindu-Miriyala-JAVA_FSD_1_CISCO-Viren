package CollectionAssignment;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ClollectionEx {

	public static void main(String[] args) {

		LinkedHashSet<String> h = new LinkedHashSet<String>();

		h.add("a");
		h.add("k");
		h.add("True");
		h.add("n");
		h.add("45");
		h.add("c");
		h.add("d");
		h.add("m");

		System.out.println("LinkedHashset is :" + h);
		System.out.println("Size is :" + h.size());

		System.out.println("Contains element u or not :" + h.contains("u"));
		System.out.println("Is hashSet Empty :" + h.isEmpty());
		System.out.println("Remove the element d :" + h.remove("d"));
		System.out.println("LinkedHashSet is :" + h);

		h.clear();

		System.out.println("get class :" + h.getClass());
		System.out.println("is Empty :" + h.isEmpty());

		// HASHSET

		HashSet<String> hs = new HashSet<String>();

		hs.add("Apple");
		hs.add("Orange");
		hs.add("Peach");
		hs.add("Guava");

		System.out.println("Hashset is :" + hs);
		System.out.println("Size is :" + hs.size());

		System.out.println("Contains element Apple or not :" + hs.contains("Apple"));
		System.out.println("Is hashSet Empty :" + hs.isEmpty());
		System.out.println("Remove the element Apple :" + hs.remove("Apple"));
		System.out.println("HashSet is :" + hs);

		// TREESET

		TreeSet<String> hsd = new TreeSet<>();

		hsd.add("India");
		hsd.add("UK");
		hsd.add("US");
		hsd.add("Ghana");

		System.out.println("Treeset is :" + hsd);
		System.out.println("Size is :" + hsd.size());

		System.out.println("Contains element India or not :" + hs.contains("India"));
		System.out.println("Is hashSet Empty :" + hs.isEmpty());
		System.out.println("Remove the element India :" + hs.remove("India"));
		System.out.println("TreeSet is :" + hs);

	}

}

