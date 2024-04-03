package core.mate.academy.model;

public class Excavator extends Machine {
    private double diggingDepth;
    private double bucketVolume;

    public Excavator() {
    }

    public double getDiggingDepth() {

        return diggingDepth;
    }

    public void setDiggingDepth(double diggingDepth) {

        this.diggingDepth = diggingDepth;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {

        System.out.println("Excavator started to work");
    }
}
