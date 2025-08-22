package OOP.Inheritance;

class MyAnimal
{
    String name = "My Animal Class";
    void eat()
    {
        System.out.println("I am a method EAT from MyAnimal class");
    }

    MyAnimal()
    {
        System.out.println("I am a default constructor for MyAnimal Class");
    }

}

class MyDog extends MyAnimal
{
    String dogName = "MyDog Class";
    void brak()
    {
        System.out.println("I am a dog and i can bark");
    }

    void displaySuperClassData()
    {
        System.out.println(super.name);
        super.eat();
    }

    MyDog()
    {
        super();
        System.out.println("I am in child class constructor");

    }
}


public class SuperKeywordPractice {



    public static void main(String[] args) {
        MyDog sheru = new MyDog();
    }

}
