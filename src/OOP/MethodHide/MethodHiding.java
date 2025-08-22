package OOP.MethodHide;

class ParentClass{
    void display()
    {
        System.out.println("I am a parent class method");
    }
}
class ChildClass extends ParentClass{
    void display()
    {
        System.out.println("I am a child class method");
    }
}


public class MethodHiding {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        p.display();
        ChildClass c = new ChildClass();
        c.display();


        ParentClass p1 = new ChildClass();

        p1.display();



    }



}
