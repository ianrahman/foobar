import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class AccessCodes {

	public static int answer(String[] x) {
		
		Set<String> set = new HashSet<String>(Arrays.asList(x));
		int distinct = set.size();
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String next = iter.next();
			String check = new StringBuilder(next).reverse().toString();
			if (!next.equals(check)) { // is next a palindrome
				if(set.contains(check)) {
					distinct--;
					iter.remove();
				}
			}
		}
		return distinct;
	}

}
