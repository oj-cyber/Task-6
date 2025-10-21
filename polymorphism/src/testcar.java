public class testcar {
    public static void testcar(Car car){
        System.out.println("Demostrating real time polymorphsim:");
        car.start();
        car.displayInfo("Base class");

            }

    public static void main(String[] args) {
        System.out.println("--------Car--------");
        Car car=new Car("Vehicle",":000","0");
        car.start();
        car.displayInfo("Made in ??");
        testcar(car);
        System.out.println();

        System.out.println("-----Electric car----");
        electricCar electric=new electricCar("Hybrid","200km/h","beeps on start","400");
        electric.start();
        electric.displayInfo("Made in UK");
        testcar(electric);

        System.out.println();
        System.out.println("-------Sports car");
        SportsCar sports=new SportsCar("Monster Track","150km/h","1st","david.J","300km/h");
        sports.start();
        sports.displayInfo("Made in America ");
        testcar(sports);
    }

}