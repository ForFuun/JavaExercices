package temamea;

public class Barkingdog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Test cases
        boolean dogIsBarking = true;
        int hour = 20;

        boolean shouldWake = shouldWakeUp(dogIsBarking, hour);

        if (shouldWake) {
            System.out.println("Wake up!");
        } else {
            System.out.println("Stay asleep.");
        }
    }
}
