package OCP.a7concurrency.using_concurrent_collections;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ZooManager {

    private Map<String, Object> foodData = new HashMap<>();

    private Map<Integer, Object> syncronyzedFoodData = new ConcurrentHashMap<>();

    public synchronized void put(String key, Object value){
        foodData.put(key, value);
    }

    public synchronized Object get(String key){
        return foodData.get(key);
    }

    public void put(Integer key, Object value){
        syncronyzedFoodData.put(key, value);
    }

    public Object get(Integer key, Object value){
        return syncronyzedFoodData.get(key);
    }
}
