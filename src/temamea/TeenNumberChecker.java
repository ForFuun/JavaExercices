package temamea;

public class TeenNumberChecker {
    public static boolean hasTeen(int teen1 , int teen2 , int teen3){
        return (teen1 >= 13 && teen1 <= 19) || (teen2 >= 13 && teen2 <= 19) || (teen3 >=13 && teen3 <=19);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 100000;
        int c = 27;

        boolean result = hasTeen(a, b, c);
        if (result) {
            System.out.println("Unul dintre numere este intre 13 si 19");
        } else {
            System.out.println("Niciun numar nu este intre 13 si 19");
        }
    }
}


