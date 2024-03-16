package oop_practice;

public class Cpu {
    String model;
    int coreCount;
    double frequency;

    public Cpu(String model, int coreCount, double frequency) {
        this.model = model;
        this.coreCount = coreCount;
        this.frequency = frequency;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }
}
