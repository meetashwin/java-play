import java.util.*;

public class GenericsPlay {
	public static void main(String[] args) {
		Integer[] i = new Integer[100];
		Collection<Integer> coll = new ArrayList<Integer>();

		Collection<Integer> newcoll = new ArrayList<Integer>();
		newcoll.add(10);
		newcoll.add(20);
		newcoll.add(30);

		CollectionGenericsPlay.printCollection(newcoll);
	}
}

class CollectionGenericsPlay {
	public static <T> void addArrayToCollection(T[] a, Collection<T> coll) {

	}

	public static <T> void printCollection(Collection<T> coll) {
		if (coll == null) 
			return;

		coll.forEach(item -> {
			System.out.println(item);
		});
	}
}