package Interview;

public class B extends A {
 int a=5;
 static int b=5;

    public static void main(String[] args){
        B b1= new B();
        int add = b1.add(7);
        System.out.println(add);

    }


    public int add(int a){
        return a+b;
    }
}
