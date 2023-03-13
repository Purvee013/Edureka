import java.util.HashMap;
import java.util.LinkedHashMap;

public class Map {
	public static void main(String[] args) 
    { 
  lengthOfLongestString("abcabc");
    }

	private static void lengthOfLongestString(String str) {
		String s=null;
		int Slen=0;
		HashMap<Character,Integer> map =new LinkedHashMap<Character,Integer>();
		char[] arr=str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}
			else {
				i=map.get(ch);
				map.clear();
			}
			if(map.size()>Slen) {
				Slen=map.size();
				s=map.keySet().toString();
			}
		}
		System.out.println("Length of Longest string"+Slen);
		System.out.println(" Longest string"+s);
	} 
}
