package GetterAndSetterPackage;


import javax.swing.plaf.IconUIResource;

class MyStudent{
    private String name;
    private int id;

    MyStudent(String name,int id)
    {
        this.name = name;
        this.id = id;
    }

    // getters
    String getName()
    {
        return this.name;
    }
    int getId()
    {
        return this.id;
    }

    // setters
    void setName(String name)
    {
        this.name = name;
    }

    void setId(int id)
    {
        this.id = id;
    }

}

public class GetterSetterPractice {

    public static void main(String[] args) {
        MyStudent samarth = new MyStudent("Samarth",1);

//        System.out.println(samarth.name);
//        System.out.println(samarth.id);
        System.out.println("By using getter methods");
        System.out.println(samarth.getId());  // 1
        System.out.println(samarth.getName()); // Samarth


        int a = 2;

        samarth.setId(a);
        System.out.println("After Using Setter Method");
        System.out.println(samarth.getId());  // 2
        System.out.println(samarth.getName()); // Samarth


    }





}
