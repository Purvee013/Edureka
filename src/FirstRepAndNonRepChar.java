
public class FirstRepAndNonRepChar {
public static void main(String[] args) {
	String str="Purvee Pandey";
	for(int i=0;i<str.length();i++) {
		int c=0;
		for(int j=i;j<str.length();j++) {
			if(str.charAt(i)==str.charAt(j)) {
				c++;
			}}
		 if(c>1) {
			System.out.println("First  repeating char :" +str.charAt(i));
			break;
		}
			if(c==1) {
				System.out.println("First non repeating char :" +str.charAt(i));
				break;
			}
			
			
	}
	
}
}
