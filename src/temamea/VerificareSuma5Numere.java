package temamea;

public class VerificareSuma5Numere {
    public static boolean Suma(int num1 , int num2 , int num3 , int num4 , int num5){
        return num1+num2+num3+num4 == num5;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 7;
        int d = 4;
        int e = 10;

        boolean result = Suma(a, b, c, d, e);
        if (result) {
            System.out.println("Suma lor este egala cu ultmul numar");
        } else {
            System.out.println("Suma lor nu este egala cu ultimul numar");
        }
    }
}

