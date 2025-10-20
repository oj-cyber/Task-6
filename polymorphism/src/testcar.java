public class testcar {
    public static void testcar(Car car){
        System.out.println("Car testing:");
        car.start();
        car.displayInfo();

            }

    public static void main(String[] args) {
        System.out.println("--------Car--------");
        Car car=new Car("Vehicle",":000","0");
        car.start();
        car.displayInfo("Made in ??");
        testcar(car);
        System.out.println();

        System.out.println("-----Electric car------");
        electricCar electric=new electricCar("Hybrid","200km/h","beeps on start","400km/h");
        electric.start();
        electric.displayInfo("Made in UK");
        testcar(electric);

        System.out.println();
        System.out.println("-------Sports car-------");
        SportsCar sports=new SportsCar("Monster Track","150km/h","1st","David.J","300km/h");
        sports.start();
        sports.displayInfo("Made in America NewYork");
        testcar(sports);
    }

}