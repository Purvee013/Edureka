
public class Remove_Duplicate {
public static void main(String[] args) {
	String str="Programming";
	StringBuilder sb=new StringBuilder();
	str.chars().distinct().forEach(c->sb.append((char)c));
	System.out.println(sb);
}
}
