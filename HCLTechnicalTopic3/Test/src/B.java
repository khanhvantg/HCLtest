abstract class TestAbstract {
    String name;
    String myName(){
        name = "Alexander";
        return name;
    }
    abstract void display();
}

public class B extends TestAbstract {
    void display(){
        String n = myName();
        System.out.print("My name is "+ n);
    }
    public static void main(String args[]) {
        B t = new B();
        t.display();
    }
}