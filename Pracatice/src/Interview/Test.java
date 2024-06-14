package Interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test {


    public static void main(String[] args) {

        List<Employee> empl= new ArrayList<>();
        empl.add(new Employee("aashutosh",444L,true));
        empl.add(new Employee("harsh",55L,false));
        empl.add(new Employee("pandu",765446L,false));
        empl.add(new Employee("landu",754356L,true));
        empl.add(new Employee("mandu",674356L,true));
        empl.add(new Employee("candu",659356L,true));
        empl.add(new Employee("santu",644356L,true));
        empl.add(new Employee("satdu",694356L,true));
        empl.add(new Employee("chandu",7754356L,true));
       // Collections.sort(empl);
      //  System.out.println(empl);
        List<Employee> collect = empl.stream().sorted((i1, i2) -> (i1.emplId > i2.emplId) ? +1 : (i1.emplId < i2.emplId) ? -1 : 0).collect(Collectors.toList());
        System.out.println(collect);
        List<Employee> collect1 = empl.stream().sorted().collect(Collectors.toList());
        System.out.println(collect1);
        //for (Employee employee:empl){
         //   System.out.println(employee );
       // }
    }

}
