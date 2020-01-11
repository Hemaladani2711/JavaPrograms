import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAnagrams {

    public List<List<String>> findAnagrams(List <String> dictionary){
        Map<String, List<String>> sortedAnagrams = new HashMap<>();
        for(String s : dictionary){
            /*String sorted = Stream.of(s.split("")).sorted().collect(Collectors.joining());
            System.out.println("S:"+s+" ,Sorted: "+sorted);
            */
            char [] temparray = s.toCharArray();
            String sorted = new String(temparray);

            sortedAnagrams.putIfAbsent(sorted,new ArrayList<>());
            sortedAnagrams.get(sorted).add(s);
        }

        return sortedAnagrams.values().stream().filter(group->group.size()>=2).collect(Collectors.toList());
    }
}
