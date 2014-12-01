import java.util.*;

public class Most_Least_Ch {
	int x =0;
	
	public Most_Least_Ch() {
	
	}
	public static void main(String[] args) {
		String str = "sssaaaeedd";
		int len = str.length();
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		String st = ""; int count = 1;
		for(int i=0; i<len; i++){
			char ch = str.charAt(i);
			if(st.contains(ch+"")) {
				String s = ""+ch;
				map.put(s, map.get(s)+1);
			}
			else {
				st = st + ch;
				String stt = ""+ch;
				map.put(stt, 1);
			}
		}
		List<String> least = new ArrayList<String>();
		String most = ""; int flag = 1;
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			if(m.getValue() > flag) {
					flag = m.getValue();
					most = m.getKey();
			}
			if(m.getValue() == 1) {	
				least.add(m.getKey());
			}
			else if(m.getValue() == 2) {
				least.add(m.getKey());
			}
		}
		int max = Character.MAX_VALUE; String min = "";
		for(String sss : least){
			char ch = sss.charAt(0);
			int ch_i = (int)ch;
			System.out.println(": " + ch + " is "+ ch_i);
			if(ch_i < max) {
				min = ""+ch;
				max = ch_i;
			}
				
		}
		
		System.out.println("Most character is " + most);
		System.out.println("Least Character is :"+ min);
	}
}