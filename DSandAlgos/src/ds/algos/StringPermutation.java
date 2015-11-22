package ds.algos;

import java.util.Arrays;

public class StringPermutation {

	public static void main(String[] args) {
      System.out.println(sort("challa"));
	}
	
	public static StringBuilder[] permutations(String s) {
        if (s.length() == 0)
            return null;
        int length = s.length();
        StringBuilder[] sb = new StringBuilder[length];
        for (int i = 0; i < length; i++) {
            sb[i] = new StringBuilder();
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int times = length / (i + 1);
            for (int j = 0; j < times; j++) {
                for (int k = 0; k < length / times; k++) {
                    sb[j * length / times + k].insert(k, ch);
                }
            }
        }
        return sb;
    }
	
   
    public static String sort(String word){
    	char letter[]=word.toCharArray();
    	Arrays.sort(letter);
    	return new String(letter);
    }
	
	
	
	

}
