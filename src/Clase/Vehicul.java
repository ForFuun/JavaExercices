package Clase;

public class Vehicul {

    public static String Manuala = "cu 6 viteze";

    //atribute
    String marca;
    int kilometraj;
    String litereinmatriculare;

    //contructor
    Vehicul(){
        marca = "AlfaRomeo";
        kilometraj = 10000;
        litereinmatriculare = "MMI";

    }
    Vehicul(String marca, int kilometraj){
        this.marca = marca;
        this.kilometraj = kilometraj;

    }

    //metode
    void masina(){
        System.out.println("Aici avem un BMW");
    }

    void autobuz(){
        System.out.println("Aici avem un Solaris");
    }

    public static boolean merge(int dataAccident){
 /*       if (dataAccident>0){
            return false;
        }else{
            return true;
        }*/

        return dataAccident>0 ? false : true;
    }
}
