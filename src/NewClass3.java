
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        Map
    key        value
    unique     duplicate

    1 -> java
    5 -> java
    5 -> android
 */
public class NewClass3 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("j", "java");
        map.put("a", "android");
        map.put("p", "php");
        map.put("p", "python");
        
        System.out.println(map);
        
        String p = map.get("p");
        System.out.println(p);
        
        
        Set<Map.Entry<String ,String>> entrySet = map.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            //System.out.println(entry.getKey()+"   "+entry.getValue());
            if(entry.getValue().equals("java")){
                System.out.println(entry.getKey());
            }
        }
        
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
        
        Object[] array = values.toArray();
        
        
        
        Set<String> set = map.keySet();
        for (String keys : set) {
            System.out.println(keys);
        }
        Object[] karr = set.toArray();
    }
    
}
