package oop_practice;

public class Notebook {
    Cpu cpu;
    Hdd hdd;
    Os os;
    Ram ram;

    public Notebook(Cpu cpu, Hdd hdd, Os os, Ram ram) {
        this.cpu = cpu;
        this.hdd = hdd;
        this.os = os;
        this.ram = ram;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public Os getOs() {
        return os;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Ram getRam() {
        return ram;
    }
}
