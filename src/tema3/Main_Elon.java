package tema3;

public class Main_Elon {
    public static void main(String[] args) {
        ElonsToyCar car = ElonsToyCar.buy();
        System.out.println(car.distanceDisplay()); // Afiseaza "Driven 0 meters"
        System.out.println(car.batteryDisplay());  // Afiseaza "Battery at 100%"
        car.drive();
        System.out.println(car.distanceDisplay()); // Afiseaza "Driven 20 meters"
        System.out.println(car.batteryDisplay());  // Afiseaza "Battery at 99%"
    }
}
