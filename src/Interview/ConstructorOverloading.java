package Interview;

class NewClassA
{
    String name;
    int age;
    String course;

    // Default
    NewClassA()
    {
        name="SampleName";
        age=18;
        course="SampleCourse";
    }

    NewClassA(String name,int age,String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    // works on 2 params
    int addition(int a,int b)
    {
        return a+b;  // diff body
    }
    // works on 3 params
    int addition(int a,int b,int c)
    {
        return a+b+c;  // diff body
    }
}


public class ConstructorOverloading {
    public static void main(String[] args) {

        NewClassA sample = new NewClassA();

        System.out.println(sample.name);
        System.out.println(sample.age);
        System.out.println(sample.course);

        NewClassA sampleTwo = new NewClassA("Alex",28,"Bsc");

        System.out.println(sampleTwo.name);
        System.out.println(sampleTwo.age);
        System.out.println(sampleTwo.course);

        System.out.println(sampleTwo.addition(1,2));
        System.out.println(sampleTwo.addition(1,2,3));

    }
}
