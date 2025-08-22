package OOP.Inheritance;

class Animal
{
    void eat()
    {
        System.out.println("I am an animal and i can eat");
    }
    void walk()
    {
        System.out.println("I am an animal and i can walk");
    }
}

class Dog extends Animal {
    void bark()
    {
        System.out.println("I am a dog and i can bark");
    }
    void security()
    {
        System.out.println("I am a dog and i provide security");
    }

}



public class SingleInheritance {

    public static void main(String[] args) {

        Animal animal = new Animal();

//        animal.eat();
//        animal.walk();

        Dog dog = new Dog();
        // Dog class properties
        dog.bark();
        dog.security();

        // Animal Class Properties
        dog.eat();
        dog.walk();

    }

}
