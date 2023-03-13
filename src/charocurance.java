import java.util.Arrays;
import java.util.HashMap;

public class charocurance {
public static void main(String[] args) {
	String str="Yagyesh";
	str=str.toLowerCase();
	HashMap<Character, Integer> map=new HashMap<>();
	char []c=str.toCharArray();
	for(char ch:c) {
	if(!map.containsKey(ch)) {
		map.put(ch, 1);
	}else {
		int value=map.get(ch);
		map.put(ch, value+1);
	}}
	System.out.println(map);
}
}



