import java.util.Scanner;

public class RepeatingChar {
	static int c=0;
public static void main(String[] args) {
	System.out.println("Enter a String");
	
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	System.out.println("String entered : "+str);
	char ch[]=str.toCharArray();
	for(int i=0;i<ch.length-1;i++) {
		if(ch[i]==ch[i+1]) {
			c++;
			System.out.println("Repeating char is : " +ch[i]+ "Repeats "+c+"times");
		}
		else
			System.out.println("Nothing repetative");
		
	}
	
}
}
