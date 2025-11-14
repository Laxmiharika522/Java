package PAT4;
import java.util.HashMap;
import java.util.Map;

public class hash_map {
    public static void main(String a[]){
        HashMap<String,Integer>hashMap = new HashMap<String,Integer>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Jim", 35);

        //it wont update the map it will add
        hashMap.put("jim",45);

        //it will replace the data
        hashMap.replace("John", 10);

         // remove element with a key
         hashMap.remove("jane");

         //iterating
         for(Map.Entry<String,Integer>mpp: hashMap.entrySet()){
                System.out.println(mpp.getKey() + ":" + mpp.getValue());
         }

         //iterating
        for(String key: hashMap.keySet()){
            System.out.println(key + ":" + hashMap.get(key));
        }

        //shallow copy you can use in arrays also
        //HashMap<String,Integer>hashMap1 = (HashMap<String, Integer>)hashMap.clone();
        HashMap<String, Integer> hashMap2 = new HashMap<>(hashMap);

        //isEmpty()	Returns true if this map contains no key-value mappings.
        //keySet()	Returns a Set view of the keys contained in this map.   

        //put(K key, V value)
        //remove(Object key)

        //size()

        System.out.println(hashMap.values()); //a view of the values contained in this map //[25, 30, 35, 45]
        System.out.println(hashMap.keySet()); //[John, Jane, Jim, jim]
        //System.out.println(hashMap.valueSet()); //valueSet is not there only values() is there


        //result.put(fruit,result.getOrDefault(fruit,0)+1);

    }
}
