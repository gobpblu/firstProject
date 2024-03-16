package oop_practice;

public class OopPractice {
    public static void main(String[] args) {
        Cpu cpu = new Cpu("core i7", 8, 2.3);
        Hdd hdd = new Hdd(1024, 100);
        Os os = new Os("Windows", "10");
        Ram ram = new Ram("DDR", 8);
        Notebook notebook = new Notebook(cpu, hdd, os, ram);
        printNotebookInfo(notebook);
    }

    public static void printNotebookInfo(Notebook notebook) {
        System.out.println("NOTEBOOK consists of:  " + notebook.toString() +
                "\nHDD: скорость(" + notebook.getHdd().getSpeed() + "), pазмер(" + notebook.getHdd().getSize() + ")" +
                "\nCPU: модель(" + notebook.getCpu().getModel() + "), количество ядер(" + notebook.getCpu().getCoreCount() + "), частота(" + notebook.getCpu().getFrequency() + ")" +
                "\nOS: наименование(" + notebook.getOs().getName() + "), версия(" + notebook.getOs().getVersion() + ")" +
                "\nRam: модель(" + notebook.getRam().getModel() + "), размер(" + notebook.getRam().getSize() + ")");
    }
}
