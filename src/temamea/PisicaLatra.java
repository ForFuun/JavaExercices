package temamea;

public class PisicaLatra {
    public static boolean Trezirea(int ora, boolean latra) {
        if (ora < 0 || ora > 23) {
            return false;
        }
        if (latra && (ora < 8 || ora > 22)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean pisiculLatra = true;
        int ceasul = 23;
        boolean omulSeTrezeste = Trezirea(ceasul, pisiculLatra);
        if (omulSeTrezeste) {
            System.out.println("Trezirea!");
        } else {
            System.out.println("Dormi!");
        }
    }
}
