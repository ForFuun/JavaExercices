package temamea;

public class EqualByThreeDecimalPlaces {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // Multiply both numbers by 1000 to remove decimal places.
        int scaledNum1 = (int) (num1 * 1000);
        int scaledNum2 = (int) (num2 * 1000);

        return scaledNum1 == scaledNum2;
    }

    public static void main(String[] args) {
        double number1 = 3.1756;
        double number2 = 3.1767;

        boolean result = areEqualByThreeDecimalPlaces(number1, number2);
        if (result) {
            System.out.println("The numbers are equal up to three decimal places.");
        } else {
            System.out.println("The numbers are not equal up to three decimal places.");
        }
    }
}



