package oop.interfaces;

public class Monitor implements Products{
    String name;
    int inches;

    public Monitor(String name,int inches ) {
        this.inches = inches;
        this.name = name;
    }

    @Override
    public void describe() {
        System.out.println("A monitor is an electronic visual computer display that includes a screen, circuitry and the case in which that circuitry is enclosed.");
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "name='" + name + '\'' +
                ", inches=" + inches +
                '}';
    }
}
