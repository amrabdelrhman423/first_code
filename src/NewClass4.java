
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 
 */
public class NewClass4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("F");
        list.add("V");
        list.add("H");
        
        //convert from list to array
        Object[] arr = list.toArray();
        
        
        //convert from array to list
        String strArr [] ={"M","H","S"};
        List<String> asList = Arrays.asList(strArr);
        
        
        
    }
    
}
