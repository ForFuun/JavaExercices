package tema3;
import java.util.Arrays;

public class Main_BirdWatcher {
    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);

        System.out.println("Last Week: " + Arrays.toString(birdCount.getLastWeek()));
        System.out.println("Today: " + birdCount.getToday());

        birdCount.incrementTodaysCount();
        System.out.println("Today after increment: " + birdCount.getToday());

        System.out.println("Has Day Without Birds: " + birdCount.hasDayWithoutBirds());

        System.out.println("Count for First 4 Days: " + birdCount.getCountForFirstDays(4));
        System.out.println("Busy Days: " + birdCount.getBusyDays());
    }
}

