import java.util.Scanner;

public class StringReverse{
public static void main(String args[]) {
String input, rev="";
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string to reverse");//Hey You

input=sc.nextLine();//input=Hey You
int length=input.length(); //length=7 (space also counted)

for(int i=length-1;i>=0;i--)//i=6;i>=0//i=5//i=4//i=3
  rev=rev+input.charAt(i);//rev=""+uoY
System.out.println("Reversed string: "+rev);//uoY
}
}