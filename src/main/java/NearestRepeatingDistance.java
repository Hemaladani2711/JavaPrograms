import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class NearestRepeatingDistance {
    public int nearestRepeatingDistance(List<String> paragraph){
        int nearestRepeating = Integer.MAX_VALUE;
        HashMap<String,Integer> map = new HashMap<>();
        for(int i = 0;i<paragraph.size();i++){
            if(map.containsKey(paragraph.get(i))){
                System.out.println("Word: "+paragraph.get(i)+ " , nearest: "+nearestRepeating);
                nearestRepeating = Math.min(nearestRepeating,i-map.get(paragraph.get(i)));
            }
                map.put(paragraph.get(i),i);
        }
        System.out.println(""+ Arrays.asList(map.values()));
        return nearestRepeating==Integer.MAX_VALUE?-1:nearestRepeating;
    }
}
