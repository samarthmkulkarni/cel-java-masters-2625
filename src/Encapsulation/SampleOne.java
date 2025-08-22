package Encapsulation;

class Student {

    // This is DATA MEMBER

    // By Default All Data is Default
    public String studentName;
    int studentAge;
    float studentWeight;
    String studentCourse;

    // THIS IS MEMBER FUNCTION
    void sampleFunction()
    {
        System.out.println("This is the sample function from class Student !");
    }

}


public class SampleOne {
    public static void main(String[] args) {

        Student john = new Student();

        int a;

        a = 10;

        john.studentName  = "John Cena";
        john.studentAge = 23;
        john.studentWeight = 50.5f;
        john.studentCourse ="WWE";


        // now john has all the information

        // Database table  Student
        // Colns : name, age , weight, course


        // john ==============> data base
        // This is how we can store values in tables using objects

        System.out.println(john.studentName);
        System.out.println(john.studentAge);
        System.out.println(john.studentWeight);
        System.out.println(john.studentCourse);

        john.sampleFunction();

    }
}