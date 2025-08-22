package ExceptionHandling;


import java.util.ArrayList;

class SampleClass{
    void display(){
        System.out.println("Hiii");
    }
}

public class OutOfMemory {

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        while (true)
        {
            list.add(new int[1000000]); // Attempting to allocate large arrays repeatedly
        }
    }

}
