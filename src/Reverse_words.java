
public class Reverse_words {
public static void main(String[] args) {
	String str="Ruchi Mishra";
	String output=" ";
	
	String word[]=str.split(" ");
	for(String w:word) {
		String rev=" ";	
		for(int i=w.length()-1;i>=0;i--) {
			rev=rev+w.charAt(i);
		}
		output=output+rev+" ";
	}
	
	System.out.println(output);
}
}

