public class Car {
    protected  String brand;
    protected  String speed;

    public Car(String brand, String speed) {
        this.brand = brand;
        this.speed = speed;
    }
    public  void start() {
        System.out.println("Car:"+" "+brand + " " + "engine is starting ");
    }

    public void displayInfo() {
        System.out.println("Car:" +" "+ brand + " "  + "speed:"+" "+speed + "km/h");
    }
    public void displayInfo(String OtherInformation) {
        System.out.println("Car:" + brand + " " +   speed);

    }

}

