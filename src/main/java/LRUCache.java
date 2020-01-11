import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;


//This is brilliant class
public class LRUCache {

    LinkedHashMap<Integer, Integer> map;
    public LRUCache(int capacity) {
        map = new LinkedHashMap<Integer,Integer>(capacity,1.0f,true){
            @Override
            public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest){
                return map.size()>capacity;
            }
        };
    }

    public int get(int key) {
        return map.getOrDefault(key,-1);
    }

    public void put(int key, int value) {
        map.put(key,value);
    }

    @Override
    public String toString() {
        return map.values().toString();
    }
}
