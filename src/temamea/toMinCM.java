package temamea;

public class toMinCM {
    public static void main(String[] args) {
        int Meters = 245;
        int Centimeters = Meters * 100;
        if (Meters < 0){
            System.out.println("Invalid");
        }else if(Meters > 0){
            System.out.println("We have: " + Meters + " Meters //That means:" + Centimeters + " Centimeters");
        }else{
            System.out.println("0 is 0. We cont convert 0 Meters in Centimeters");
        }
    }
}
