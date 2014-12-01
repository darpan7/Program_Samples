import java.util.*;

public class String_Permute {
	
	
	public String_Permute() {
		
	}
	public static void main(String[] args) {
		String s = "ABC";
		String s1 = "EBAY";
		String s2 = "Yahoo";
		System.out.println("\nString " + s + ":\nPermutations: " + String_Permutation(s));
	//	System.out.println("\nString " + s1 + ":\nPermutations: " + String_Permutation(s1));
	//	System.out.println("\nString " + s2 + ":\nPermutations: " + String_Permutation(s2));
	}
		 
	public static Set<String> String_Permutation(String str) {
		Set<String> crunchifyResult = new HashSet<String>();
		if (str == null) {
			return null;
		} else if (str.length() == 0) {
			crunchifyResult.add("");
			return crunchifyResult;
		}
		 
		char firstChar = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = String_Permutation(rem);
		System.out.println("Rem is : " + words);
		for (String newString : words) {
			System.out.println("Inside : " + newString);
			for (int i = 0; i <= newString.length(); i++) {
				crunchifyResult.add(crunchifyCharAdd(newString, firstChar, i));
			}
		}
		return crunchifyResult;
	}
		 
	public static String crunchifyCharAdd(String str, char c, int j) {
		String first = str.substring(0, j);
		String last = str.substring(j);
		return first + c + last;
	}
	
	/*
		public static void main(String args[]) {
			permuteString("", "ABC");
		}

		public static void permuteString(String beginningString, String endingString) {
			if (endingString.length() <= 1)
			  System.out.println("** : " + beginningString + endingString);
			else {
			  for (int i = 0; i < endingString.length(); i++) {
				try {
				  String newString = endingString.substring(0, i) + endingString.substring(i + 1);
				  System.out.println("Calling : "+ beginningString + endingString.charAt(i) + " , & "+ endingString.substring(0, i) + ": " + endingString.substring(i + 1) + "@ " + i );
				  permuteString(beginningString + endingString.charAt(i), newString);
				  
				} catch (StringIndexOutOfBoundsException exception) {
				  exception.printStackTrace();
				}
			 }
			}
		}
		
		//System.out.println("***************** Total is : " +count);
	*/
}