package temamea;

public class SumChecker {
    public static boolean Sum(int num1 , int num2 , int num3){
        return (num1 + num2) == num3;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 2;

        boolean result = Sum(a , b , c);
        if(result){
            System.out.println("Suma a + b = c");
        }else{
            System.out.println("Suma a+b nu este egal cu c");
        }
    }
}


