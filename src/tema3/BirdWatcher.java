package tema3;

class BirdWatcher {
    private final int[] birdsPerDay;
    private int currentDay; // Keep track of the current day

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
        this.currentDay = 0; // Initialize the current day to 0
    }

    public int[] getLastWeek() {
        return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        // Check if the current day index is within bounds before accessing the array
        if (currentDay >= 0 && currentDay < birdsPerDay.length) {
            return birdsPerDay[currentDay];
        } else {
            // Handle the case where the current day index is out of bounds
            return -1; // You can choose an appropriate value for error handling
        }
    }

    public void incrementTodaysCount() {
        if (currentDay >= 0 && currentDay < birdsPerDay.length) {
            birdsPerDay[currentDay]++;
        }
    }

    public boolean hasDayWithoutBirds() {
        for (int count : birdsPerDay) {
            if (count == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }

    public int getBusyDays() {
        int busyDays = 0;
        for (int count : birdsPerDay) {
            if (count >= 5) {
                busyDays++;
            }
        }
        return busyDays;
    }

    public void nextDay() {
        if (currentDay < birdsPerDay.length - 1) {
            currentDay++;
        }
    }
}
