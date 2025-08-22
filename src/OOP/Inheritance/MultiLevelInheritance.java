package OOP.Inheritance;

class Vehicle
{
    int breaks = 2;
    int wheels = 4;
    int gears = 5;
}

class Car extends Vehicle{
    int windows = 6;
    int steering = 1;
    int roof = 1;
}

class Swift extends Car{
    String name = "Swift";
    String model = "Dezire";
    String color = "White";
}


public class MultiLevelInheritance {
    public static void main(String[] args) {

        Swift konmalCar = new Swift();

        System.out.println(konmalCar.color);
        System.out.println(konmalCar.model);
        System.out.println(konmalCar.name);
        System.out.println("Windows are "+konmalCar.windows);
        System.out.println("Steering is "+konmalCar.steering);
        System.out.println("Roof is "+konmalCar.roof);

        System.out.println("Breaks are "+konmalCar.breaks);
        System.out.println("Gears are "+konmalCar.gears);
        System.out.println("Wheels are "+konmalCar.wheels);


    }
}
