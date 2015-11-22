package ds.algos;

import java.util.Arrays;
import java.util.Comparator;

public class AnagramComparator implements Comparator {
	
	
	public String sortChars(String word)
	{
		char letters[]=word.toCharArray();
		Arrays.sort(letters);
    	return new String(letters);
	}

	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();
	   return  sortChars(s1).compareTo(sortChars(s2));
	}


}
