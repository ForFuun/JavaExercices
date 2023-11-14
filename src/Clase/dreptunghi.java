package Clase;

public class dreptunghi extends ObiectGrafic {

    double lungime;
    double latime;

    @Override
    public double arie() {
        return lungime * latime;
    }

    @Override
    public double perimetru() {
        return 2 * (lungime + latime);
    }
}
