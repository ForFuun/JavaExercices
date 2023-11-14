package temamea;

public class PleacaLaPlimbare {
    public static boolean ArTrebuiSaPlece(boolean pleaca, int ora) {
        if (ora < 0 || ora > 23) {
            return false;
        }
        if (pleaca && (ora < 8 || ora > 18)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean Iuliapleaca = true;
        int ceasul = 13;

        boolean Iuliasetrezeste = ArTrebuiSaPlece(Iuliapleaca, ceasul);
        if (Iuliasetrezeste) {
            System.out.println("Iulia pleaca la munca");
        } else {
            System.out.println("Iulia e libera");
        }
    }
}
