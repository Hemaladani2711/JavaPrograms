import java.util.HashMap;
import java.util.Map;

public class VerifyingAlienDictionary {
    public boolean isAlienSorted(String[] words, String order) {

        HashMap<Character,Integer> orderMappings = new HashMap<>();
        HashMap<String,Integer> resultArray = new HashMap<>();
        for(int i = 0; i < order.length();i++){
            orderMappings.put(order.charAt(i),i);
        }
        for(int i=0;i<words.length;i++){
            int total=0;
            String word = words[i];
            for(int j = 0 ; j<word.length();j++){
                total += orderMappings.get(word.charAt(j));
            }

            for(Map.Entry<String,Integer> entry : resultArray.entrySet()){
                if(entry.getValue()>total){
                    return false;
                }
            }
        }


        return true;
    }
}
