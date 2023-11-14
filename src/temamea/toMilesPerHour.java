package temamea;

public class toMilesPerHour {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1; // Invalid value
        } else {
            double milesPerHour = kilometersPerHour / 1.60934;
            return Math.round(milesPerHour);
        }
    }

    public static void main(String[] args) {
        double kilometersPerHour = 200;
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (milesPerHour == -1) {
            System.out.println("Invalid value");
        } else {
            System.out.println(kilometersPerHour + " km/h is approximately " + milesPerHour + " mph");
        }
    }
}
