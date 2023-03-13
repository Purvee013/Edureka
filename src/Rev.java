
public class Rev {
public static void main(String[] args) {
	String str="Ruchi Mishra";
	String output=" ";
	System.out.println("Original String -> "+str);
	String arr[]=str.split(" ");
	for(String s:arr) {
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		output=output+rev+" ";
	}
	System.out.println("recersed -> "+output);

}}