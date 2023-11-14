package tema3;

public class ElonsToyCar {

    private static final int MAX_BATTERY = 100;
    private static final int DRIVEN_PER_DRIVE = 20;

    private int battery;
    private int distanceDriven;

    private ElonsToyCar() {
        this.battery = MAX_BATTERY;
        this.distanceDriven = 0;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        if (battery == 0) {
            return "Battery empty";
        } else {
            return "Battery at " + battery + "%";
        }
    }

    public void drive() {
        if (battery > 0) {
            distanceDriven += DRIVEN_PER_DRIVE;
            battery--;
        }
    }
}
