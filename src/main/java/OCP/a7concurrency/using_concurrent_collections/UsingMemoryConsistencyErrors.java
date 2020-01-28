package OCP.a7concurrency.using_concurrent_collections;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;

public class UsingMemoryConsistencyErrors {


    public static void main(String[] args) {

        Map<String, Object> foodData = new HashMap<>(); // ConcurrentHashMap
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);
        for(String key: foodData.keySet())
            foodData.remove(key);


    }
}
