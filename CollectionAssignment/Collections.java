package CollectionAssignment;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Collections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashSet l1 = new LinkedHashSet();
		TreeSet<String> t = new TreeSet<String>();
		LinkedHashSet<Integer> l2 = new LinkedHashSet<Integer>();

		l1.add(sc.nextInt());
		l1.add(sc.nextInt());
		l1.add(sc.nextFloat());
		l1.add(sc.nextFloat());
		l1.add(sc.next());
		l1.add(sc.next());
		l1.add(sc.nextBoolean());
		l1.add(sc.nextBoolean());
		System.out.println("values of L1:" + l1);
		System.out.println("enter 8 integer values");
		for (int i = 1; i <= 8; i++) {
			l2.add(sc.nextInt());
		}
		System.out.println("Values of L2: " + l2);
		t.add("C");
		t.add("AWS");
		t.add("Java");
		t.add("Python");
		t.add("GIT");
		t.add("Data Stucture");
		System.out.println(t.remove("AWS"));
		System.out.println(t.remove("Python"));
		System.out.println("After Removing:" + t);
		t.add("ML");
		t.add("IOT");
		t.add("UI");
		System.out.println("After adding 3 Languages:" + t);
		System.out.println("Is Set contains java :" + t.contains("Java"));
		t.clear();
		System.out.println("After removing all elements From set:" + t);

	}
}

