package Clase;

public abstract class ObiectGrafic {

    public double x,y;

    public ObiectGrafic(){
        super();
        x = 1.0;
        y = 2.5;
    }
    public abstract double arie();
    public abstract double perimetru();


}
