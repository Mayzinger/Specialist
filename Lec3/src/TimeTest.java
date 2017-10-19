import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class TimeTest {

	public static void main(String[] args) {
		long nanoTime = System.nanoTime();
		ArrayList<Integer> arrayList = new ArrayList<>();
		LinkedList<Integer> linkedList = new LinkedList();

		for (int i = 0; i < 1000_000; i++) {
			arrayList.add(1);
			linkedList.add(1);
		}
		
		
		nanoTime = System.nanoTime();
		arrayList.remove(arrayList.size()/2);
		System.out.println((System.nanoTime() - nanoTime)/1000/1000d);
		nanoTime = System.nanoTime();
		linkedList.remove(arrayList.size()/2);
		System.out.println((System.nanoTime() - nanoTime)/1000/1000d);
		
	}

	// private static void time() {
	// long milles = System.currentTimeMillis();
	// long nanoTime = System.nanoTime();
	// long startTime = milles-nanoTime;
	// System.out.println(new Date(startTime));
	// System.out.println(System.nanoTime()-nanoTime);
	// }
	// private static void time() {
	// ArrayList<Integer> arrayList = new ArrayList<>();
	// }

}
