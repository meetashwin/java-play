import java.util.*;

public class GenericsPlay {
	public static void main(String[] args) {
		Integer[] i = {10, 20, 30, 40, 50};
		Collection<Integer> int_coll = new ArrayList<Integer>();

		CollectionGenericsPlay.addArrayToCollection(i, int_coll);

		CollectionGenericsPlay.printCollection(int_coll);
		CollectionGenericsPlay.printCollection(int_coll);
	}
}

class CollectionGenericsPlay {
	public static <T> void addArrayToCollection(T[] a, Collection<T> coll) {
		for (T i : a) {
			coll.add(i);
		}
	}

	public static <T> void printCollection(Collection<T> coll) {
		if (coll == null) 
			return;

		coll.forEach(item -> {
			System.out.println(item);
		});
	}
}