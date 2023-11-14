package temamea;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int yearToCheck = 2011;

        boolean isLeap = isLeapYear(yearToCheck);
        if (isLeap) {
            System.out.println("Aici avem an bisect");
        } else {
            System.out.println("Aici nu avem an bisect");
        }
    }
}

