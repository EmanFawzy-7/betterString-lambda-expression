import java.util.function.BiPredicate;
import java.util.function.Predicate;


public class BetterString {

    
	public static String betterString(String s1, String s2, BiPredicate<String, String> Bi) {
        if (Bi.test(s1, s2)) {
            return s1;
        }
            return s2;
    }
    
    public static boolean AllStringIsLetter(String s1,Predicate<Character> bi){
        // convert string to `char[]` array
        char[] chars = s1.toCharArray();
        // iterate over `char[]` array using enhanced for-loop
        for (char ch: chars) {
            if(bi.test(ch) == false){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    	String string1 = "Ahmed  is tall";
        String string2 = "Ali is a short guy";
        String longer = BetterString.betterString(string1, string2, (s1, s2) -> s1.length() > s2.length());
        String first = BetterString.betterString(string1, string2, (s1, s2) -> true);
        System.out.println(longer);
        System.out.println(first);
    }}