package oop.interfaces;

public class Processor implements Products{
    String name;
    int speed;

    public Processor(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public void describe() {
        System.out.println("A processor is an integrated electronic circuit that performs the calculations that run a computer.");
    }

    @Override
    public String toString() {
        return "Processor{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                '}';
    }
}
