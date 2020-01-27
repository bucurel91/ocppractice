package OCPPractice.hConcurrency;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CouncurentCollections {


    //Se folosesc colectii cu sincronizare
    Map<String, Object> map = new HashMap<>();

    public synchronized void put(String key, Object value){
        map.put(key, value);
    }

    public synchronized  Object get(String key){
       
        return map.get(key);
    }

    // Colectii cu concurenta

    Map<Integer, Object> map2 = new ConcurrentHashMap<>();

    public void put (Integer key, String value){

        map2.put(key, value);
    }

    public Object get(Integer key){
        return  map2.get(key);
    }
}
