package core.mate.academy.model;

public class Truck extends Machine {
    private double payloadCapacity;
    private double cargoVolume;

    public Truck() {
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    public double getCargoVolume() {
        return cargoVolume;
    }

    public void setCargoVolume(double cargoVolume) {
        this.cargoVolume = cargoVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
