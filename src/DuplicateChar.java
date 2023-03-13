
public class DuplicateChar {
public static void main(String[] args) {
	String str=new String("Priyanka Mishra"); int c=0;
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length;i++) {
		for(int j=i+1;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				System.out.println("Duplicate char in string is "+ch[i]);
				
				c++;
			}
		}
	}
	System.out.println("count is "+c);
}
}
/*
 * for(int i=0;i<str.length();i++) { for(int j=i+1;j<str.length();j++) {
 * if(str.charAt(i)==str.charAt(j)) { System.out.println("Duplicate char is " +
 * str.charAt(i) ); c++; }
 * 
 * } }System.out.println("No of occurance"+c);
 */