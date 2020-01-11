import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AnonymousLetterFromMagazine {
    public boolean isLetterConstructable(String letterText, String magazineText){
        Map<Character,Long> charFrequencyOfLetters = letterText.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        for(char c : magazineText.toCharArray()){
            if(charFrequencyOfLetters.containsKey(c)){
                charFrequencyOfLetters.put(c,charFrequencyOfLetters.get(c)-1);
                if(charFrequencyOfLetters.get(c)==0L){
                    charFrequencyOfLetters.remove(c);
                }
                if(charFrequencyOfLetters.isEmpty())
                    break;
            }

        }
        return  charFrequencyOfLetters.isEmpty();
    }
}
