public class SportsCar extends Car{
    protected String position;

    public SportsCar(String brand, String speed, String position) {
        super(brand, speed);
        this.position = position;
    }

    @Override
    public void start() {
        System.out.println("Car"+" "+brand+" "+"engine starts loudly");
    }

    public void displayInfo(String OtherInformation) {
        System.out.println("It was made in China");
    }
}