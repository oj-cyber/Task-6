public class electricCar extends Car{
    private String beep;

    public electricCar(String brand, String speed, String beep) {
        super(brand, speed);
        this.beep = beep;
    }

    @Override
    public void start() {
        System.out.println("Car:"+" "+brand+" "+"engine starts silently");
    }

    @Override
    public void displayInfo(String OtherInformation) {
        System.out.println("It was developed by John Doe");
    }
}