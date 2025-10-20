public class testcar {
    public static void testcar(Car car){
        System.out.println("Car testing:");
        car.start();
        car.displayInfo();

            }

    public static void main(String[] args) {
        System.out.println("--------Car--------");
        Car car=new Car("Vehicle",":000");
        car.start();
        car.displayInfo("Made in ??");
        testcar(car);
        System.out.println();

        System.out.println("-----Electric car----");
        electricCar electric=new electricCar("Hybrid","500km/h","beeps on start");
        electric.start();
        electric.displayInfo("Made in UK");
        testcar(electric);

        System.out.println();
        System.out.println("-------Sports car");
        SportsCar sports=new SportsCar("Monster Track","550km/h","1st");
        sports.start();
        sports.displayInfo("Made in America");
        testcar(sports);
    }

}