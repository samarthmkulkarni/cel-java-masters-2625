package OOP.Inheritance;

class MyVehicle{
    int breaks = 2;
    String lisence = "456XYZ";
    String number = "MH17 0505";
}

class MySwift extends MyVehicle {
    int wheels = 4;
    int steering = 1;
    int gears = 5;
}

class R15 extends MyVehicle{
    int wheels = 2;
    int gears = 6;
    int suspension = 2;
    int handle = 1;
}


public class HierarchicalInteritance {
    public static void main(String[] args) {
        MySwift anuragSwift = new MySwift();

        System.out.println("This is about Car");
        System.out.println(anuragSwift.breaks);
        System.out.println(anuragSwift.gears);
        System.out.println(anuragSwift.lisence);
        System.out.println(anuragSwift.number);
        System.out.println(anuragSwift.wheels);

        System.out.println("This is about Bike");

        R15 anuragBike = new R15();

        System.out.println(anuragBike.breaks);
        System.out.println(anuragBike.handle);
        System.out.println(anuragBike.gears);
        System.out.println(anuragBike.number);
        System.out.println(anuragBike.lisence);
        System.out.println(anuragBike.suspension);
    }
}
