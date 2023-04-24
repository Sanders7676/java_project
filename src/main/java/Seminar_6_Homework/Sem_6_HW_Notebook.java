package Seminar_6_Homework;

public class Sem_6_HW_Notebook {
    private final String brand;
    private final String model;
    private final String color;
    private final double screenSize;
    private final String screenTechnology;
    private final int ram;
    private final int rom;
    private final String typeDisk;

    public Sem_6_HW_Notebook(String brand, String model, String color, double screenSize, String screenTechnology,
                          int ram, int rom, String typeDisk) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.screenSize = screenSize;
        this.screenTechnology = screenTechnology;
        this.ram = ram;
        this.rom = rom;
        this.typeDisk = typeDisk;
    }
    public String printInfo(){
        System.out.printf("Brand: %s, Model: %s, Color: %s, ScreenSize: %s, ScreenTechnology: %s, RAM: %s, " +
                        "ROM: %s, TypeDisk: %s",
                brand, model, color, screenSize, screenTechnology, ram, rom, typeDisk);
        return "";
    }
    public String getBrand() {
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public String getColor() {
        return color;
    }

    public int getRam() {
        return ram;
    }

    public int getRom() {
        return rom;
    }

    public String getTypeDisk() {
        return typeDisk;
    }
}
