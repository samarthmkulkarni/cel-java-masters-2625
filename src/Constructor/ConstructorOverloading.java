package Constructor;


class Student
{
    String studentName;
    int studentId;

    // Default
    Student()
    {
        this.studentName = null;
        this.studentId = 0 ;
    }

    // Param - Constructor : 2 Params
    Student(String name, int id)
    {
        this.studentName = name;
        this.studentId = id;
    }

    // Paran : 3
    Student(String name, int id, int price)
    {
        this.studentName = name;
        this.studentId = id;
        // dont do anything with price
    }

}


public class ConstructorOverloading {

    public static void main(String[] args) {

        Student supriya = new Student("Supriya",1);

        Student anurag = new Student("Anurag",2);

        Student komal = new Student();

        // Is name for the constructor Same?
        // yes it is
        // if yes then what is the difference
        // It is in parameters
        // Student()  : Parameters 0 - Default
        // Student("Anurag",2) : Parameters 2 - Param Constructor

        // Same name for Constructor But Different Parameters
        // And They have Different Body/Implementation

        // This Concept in called Constructor Overloading

    }

}
