import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWordInString {
    public static void main(String args[]){
        String str= "this is string";
        System.out.println(str);
        String [] ar=str.split("\\s");

        String reverseString="";
        for(String s:ar) {
         //   System.out.println(s);
            String reversrWord="";
            for(int i=s.length()-1 ;i>=0;i--){
                reversrWord= reversrWord+s.charAt(i);
            }
            //System.out.println(reversrWord);
            reverseString=reverseString + reversrWord + " ";
        }

        System.out.println(reverseString);
    }

}
