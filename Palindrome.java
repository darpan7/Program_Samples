import java.util.*;

public class Palindrome {
	int x =0;
	
	public Palindrome() {
	
	}
	public static void main(String[] args) {
		String str = "aCacfzFccFzq";
		StringBuilder sb = new StringBuilder(str);
		if(sb.equals(sb.reverse().toString())) {
			System.out.println("Pali "+ sb);
		}
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			String st = "";
			if(i+1 <= str.length()) {
				st = str.substring(i+1);
			}
			else {
				break;
			}
			String temp = "";
			if(st.length() >2) {
				//System.out.println("*** " + st);
				temp = ""+ch + st.substring(0,2);
			}
			else {
				break;
			}
			if(temp.equals(new StringBuilder(temp).reverse().toString())) {
				System.out.println("Pali1 :" + temp);
			}
			for(int j=3; j<st.length(); j++) {
				String temp1 = ""+ ch + st.substring(0,j);
				StringBuilder sb1 = new StringBuilder(temp1);
				//System.out.println(" +++ "+ sb1.toString());
				if(temp1.equals(sb1.reverse().toString())) {
					System.out.println("Pali "+ temp1);
				}
			}
		}
	
	}
}