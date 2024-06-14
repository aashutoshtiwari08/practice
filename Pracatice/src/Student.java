public class Student {
    String name;
    Integer marks;


    public Student(String name, Integer marks){
        this.name= name;
        this.marks=marks;

    }
    public String toString(){
        return name +":"+ marks;
    }
}
