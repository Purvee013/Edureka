
public class ReverseEachWord
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");//[reverse,me]
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) // i=0;i<2//i=1;i<2
        {
            String word = words[i];// word=Purvee //word=Pandey
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--)  //j=6;j>=0 //6
            {
                reverseWord = reverseWord + word.charAt(j);//reverse word=eervP //yedanP
            }
             
            reverseString = reverseString + reverseWord + " "; //eervP yedanP
        }
         
        System.out.println(inputString);
         
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
    }
     
    public static void main(String[] args) 
    { 
        reverseEachWordOfString("Purvee Pandey");
    }
}