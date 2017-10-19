import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class WorldCount {

	public static void main(String[] args) {
		String s1 = "asfasdf lkd;j arerqe j;lkj aerwe ;kj;klj eee";
		String s2 = "asfasdf lkd;j arerqe j;lkj aerwe ;kj;klj eee";
		// s=s.replaceAll("\\t+","\\t").trim();
		
		//System.out.println(split.length);
		ArrayList<String> strings = new ArrayList<>();
		TreeSet<String> treeSets = new TreeSet<>();
		
		addWordsToArray(s1, strings);
		addWordsToArray(s2, strings);
		
		treeSets.addAll(strings);
//		strings.iterator().
		
		for (String string : strings) {
			System.out.println(string);
		}
		for (String string : treeSets) {
			System.out.println(string);
		}
	}

	private static void addWordsToArray(String s1, ArrayList<String> strings) {
		String[] split = s1.trim().split("\\s+");
		strings.addAll(Arrays.asList(split));
	}

}
