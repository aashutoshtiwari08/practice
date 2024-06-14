import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {

        Map<String, Integer> student = new HashMap<>();
        student.put("tinu",99);
        student.put("aashutosh",88);
        student.put("radhika",44);
        student.put("harsh",55);
        student.put("bala",29);

       List<Map.Entry<String, Integer> >collect1= student.entrySet().stream().filter(e -> e.getValue() > 30).collect(Collectors.toList());
      List<Map.Entry<String , Integer>> collect2= student.entrySet().stream().filter(m->m.getValue()<30).collect(Collectors.toList());
        System.out.println(collect2);
    }

}
