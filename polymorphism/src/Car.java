public class Car {
    protected  String brand;
    protected  String speed;
    protected String speedlimit;

    public Car(String brand, String speed,String speedlimit) {
        this.brand = brand;
        this.speed = speed;
        this.speedlimit=speedlimit;
    }
    public  void start() {
        System.out.println("Car:"+" "+brand + " " + "engine is starting ");
    }

    public void displayInfo() {
        System.out.println("Car:" +" "+ brand + " "  + "speed:"+" "+speed + " "+"Speed limit:"+" "+speedlimit);
    }
    public void displayInfo(String OtherInformation) {
        System.out.println("Car:" + brand + " " +   speed+" "+"Speed limit:"+" "+speedlimit+"km/h");

    }

}

