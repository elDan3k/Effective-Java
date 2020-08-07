package t_10_11_12_13_14_common_methods;

import java.util.HashSet;
import java.util.Set;

public class Tests {

	public static void main(String[] args) {
		Author a1 = new Author("Artur", "Nowak");
		Author a2 = new Author("Roman", "Paździoch");

		Book b1 = new Book("ASDF1234", a1);
		Book b2 = new Book("ZXCV4321", a2);
		Book b1a = new Book("ASDF1234", a1);
		Book b1b = new Book("ASDF1234", a1);
		b1a.setId(1);
		b1b.setId(1);

		System.out.println(" ======================== Books only EQUALS========================");
		checkEquals(b1, b2, b1a, b1b);

		EBook eb = new EBook("ASDF1234", a1, "URL");
		eb.setId(1);

		System.out.println(" ======================== Ebook o2 EQUALS ========================");
		checkEquals(b1, eb, b1a, b1b);

		System.out.println(" ======================== Books diff hash ========================");
		hashCheck(b1, b2);
		System.out.println(" ======================== Books same hash ========================");
		hashCheck(b1, b1a);
		System.out.println(" ======================== Books same -> diff hash ========================");
		b1a.setId(99);
		hashCheck(b1, b1a);
		System.out.println(" ======================== Books same hash ========================");
		hashCheck(b2, b2);
		System.out.println(" ======================== Book Ebook hash ========================");
		hashCheck(b1, eb);

		System.out.println(" ======================== toString() ======================== ");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(eb.toString());


	}

	private static void checkEquals(Object o1, Object o2, Object o3, Object o4) {
		boolean res1 = o1.equals(o2);
		System.out.println("Equality check (diff): " + res1);
		boolean res2 = o1.equals(o3);
		System.out.println("Equality check (same): " + res2);
		System.out.println("NULL AWARENESS x.equals(null) is always false");
		isNullAware(o1);
		System.out.println("REFLEXIVE x.equals(x) == true");
		System.out.println("o1 and o2 check");
		isReflexive(o1, o2);
		System.out.println("SYMMETRICAL if x == y then y == x");
		System.out.println("o1 vs o2 - different");
		isSymmetrical(o1, o2);
		System.out.println("o1 vs o3 - same");
		isSymmetrical(o1, o3);
		System.out.println("TRANSITIVE - if x == y and y == z then x == z");
		System.out.println("o1 vs o2 vs o3 - different");
		isTransitive(o1, o2, o3);
		System.out.println("o1 vs o3 vs o4 - same");
		isTransitive(o1, o3, o4);
		System.out.println("SERIAL - without changes in objects result is not changing");
		isSerial(o1, o2);
	}

	//relacja zwrotna
	private static void isReflexive(Object o1, Object o2) {
		System.out.println("res1 : " + o1.equals(o1));
		System.out.println("res2 : " + o2.equals(o2));
	}

	//relacja symetryczna
	private static void isSymmetrical(Object o1, Object o2) {
		System.out.println("res 1 == 2 : " + o1.equals(o2));
		System.out.println("res 2 == 1 : " + o2.equals(o1));
	}

	//relacja przechodnia
	private static void isTransitive(Object o1, Object o2, Object o3) {
		System.out.println("res 1 == 2 : " + o1.equals(o2));
		System.out.println("res 2 == 3 : " + o2.equals(o3));
		System.out.println("res 1 == 3 : " + o1.equals(o3));
	}

	//relacja spójna
	private static void isSerial(Object o1, Object o2) {
		System.out.println("res1 : " + o1.equals(o2));
		System.out.println("res2 : " + o2.equals(o1));
		System.out.println("res3 : " + o1.equals(o2));
		System.out.println("res4 : " + o2.equals(o1));
	}

	private static void isNullAware(Object o1) {
		System.out.println("res1 : " + o1.equals(null));
	}

	private static void hashCheck(Object o1, Object o2) {
		System.out.println("hash1 : " + o1.hashCode());
		System.out.println("hash2 : " + o2.hashCode());
		Set<Object> set = new HashSet<>();
		set.add(o1);
		set.add(o2);
		System.out.println("Set size : " + set.size());
	}

}
