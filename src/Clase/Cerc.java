package Clase;

public class Cerc extends ObiectGrafic {
    double raza;

    public Cerc(){
        super();
    }

    @Override
    public double arie() {
        return Math.PI * raza * raza;
    }

    @Override
    public double perimetru() {
        return 2 * Math.PI * raza;
    }
}
