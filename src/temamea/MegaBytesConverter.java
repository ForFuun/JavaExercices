package temamea;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int megabytes = kiloBytes / 1024;
            int kiloRemainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kiloRemainder + " KB");
        }
    }

    public static void main(String[] args) {
        int kiloBytes = 2500;
        printMegaBytesAndKiloBytes(kiloBytes);
    }
}