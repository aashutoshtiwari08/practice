package Interview;

public class Employee implements Comparable<Employee>{

    String emplName;
    Long emplId;
    boolean status;

    @Override
    public int compareTo(Employee o) {
        return o.emplId.compareTo(this.emplId);
    }






    public Employee() {
    }

    public Employee(String emplName, Long emplId, boolean status) {
        this.emplName = emplName;
        this.emplId = emplId;
        this.status = status;
    }
    public String toString(){
        return emplName+ ":"+ emplId +":"+ status;

    }





}
