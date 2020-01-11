import java.util.HashSet;
import java.util.Set;

public class Palindrome {
    public boolean canBePalindrome(String s){
        HashSet<Character> charsWithOddFrequency = new HashSet<>();
        for(int i = 0 ; i<s.length();i++){
            if(charsWithOddFrequency.contains(s.charAt(i))){
                charsWithOddFrequency.remove(s.charAt(i));
            }else{
                charsWithOddFrequency.add(s.charAt(i));
            }

        }
        return charsWithOddFrequency.size()<=1;
    }
}
