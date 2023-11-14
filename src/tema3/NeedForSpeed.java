package tema3;

class NeedForSpeed {
    private int speed;
    private int battery;
    private int batteryDrain;

    public NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
        this.battery = 100;
    }

    public boolean batteryDrained() {
        return battery <= 0;
    }

    public int distanceDriven() {
        return 100 - battery;
    }

    public void drive() {
        if (!batteryDrained()) {
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    public RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean carCanFinish(NeedForSpeed car) {
        while (!car.batteryDrained() && car.distanceDriven() < distance) {
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}

