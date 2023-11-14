package tema3;

public class Main_NeedForSpeed {
    public static void main(String[] args) {
        // Create a regular car
        NeedForSpeed car = new NeedForSpeed(5, 2);
        System.out.println("Distance Driven: " + car.distanceDriven()); //  0
        System.out.println("Battery Drained: " + car.batteryDrained()); //  fals

        // Drive the car
        car.drive();
        System.out.println("Distance Driven: " + car.distanceDriven()); //  5
        System.out.println("Battery Drained: " + car.batteryDrained()); // fals

        // Create a Nitro car
        NeedForSpeed nitroCar = NeedForSpeed.nitro();
        System.out.println("Distance Driven (Nitro): " + nitroCar.distanceDriven()); //  0

        // Drive the Nitro car
        nitroCar.drive();
        System.out.println("Distance Driven (Nitro): " + nitroCar.distanceDriven()); //  50

        // Create a race track
        RaceTrack raceTrack = new RaceTrack(100);

        // Test if a regular car can finish the race
        System.out.println("Can Regular Car Finish Race: " + raceTrack.carCanFinish(car)); //  true

        // Test if a Nitro car can finish the race
        System.out.println("Can Nitro Car Finish Race: " + raceTrack.carCanFinish(nitroCar)); // true
    }
}

