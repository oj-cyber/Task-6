public class electricCar extends Car{
    private String beep;

    public electricCar(String brand, String speed, String beep,String Speedlimit) {
        super(brand, speed,Speedlimit);
        this.beep = beep;
    }

    @Override
    public void start() {
        System.out.println("Car:"+" "+brand+" "+"engine starts silently ");
    }

    @Override
    public void displayInfo(String OtherInformation) {
        System.out.println("It was manufactured by John Doe");
    }
}