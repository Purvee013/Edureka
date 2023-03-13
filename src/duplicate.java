import java.util.HashMap;
import java.util.LinkedHashMap;

public class duplicate {
public static void main(String[] args) {
	String str="ANUPAMA";
	char ch[]=str.toCharArray();
	HashMap<Character,Integer> map=new LinkedHashMap<>();
	for(char c:ch) {
		if(!map.containsKey(c)) {
			map.put(c, 1);
		}
		else {
			int value=map.get(c);
			map.put(c, value+1);
		}
	}
	System.out.println(map);
}
}

/*
 * String str="ANUPAMA"; char ch[]=str.toCharArray(); HashMap<Character,Integer>
 * map=new LinkedHashMap<>(); for(int i=0;i<=ch.length-1;i++) {
 * if(!map.containsKey(ch[i])) { map.put(ch[i], 1); } else { int
 * value=map.get(ch[i]); map.put(ch[i], value+1); } } System.out.println(map);
 */