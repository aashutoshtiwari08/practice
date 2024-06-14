import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class Hash {

    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
                map.put(11,"aashutosh");
                map.put(12,"tinu");
                map.put(13,"raj");
                map.put(14,"hsbjbac");


         //to only get keys of map...
        Set<Integer> integers = map.keySet();
        System.out.println(integers);

        //to get only values from hash table...
        Collection<String> values = map.values();
        System.out.println(values);
        Set<Map.Entry<Integer, String>> entries = map.entrySet();



        // Iterating the map...
  for(Map.Entry<Integer,String> entry : entries){
      System.out.println(entry);
        }

    }
}
