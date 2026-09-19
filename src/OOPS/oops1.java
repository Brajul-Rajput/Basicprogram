package OOPS;

public class oops1 {
    static void main() {
      test td=new test();
      td.age=21;
      td.name="brajul";
      td.show();
    }
}
class test{
    String name;
    int age;
    void show(){
        System.out.println("name is "+name);
        System.out.println("age is "+age);
    }
}
