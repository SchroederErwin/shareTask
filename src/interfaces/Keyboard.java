package oop.interfaces;

public class Keyboard implements Products{
    String name;
    String type;

    public Keyboard(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void describe(){
        System.out.println("A keyboard is a peripheral device that enables a user to input text into a computer or any other electronic machinery.");
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
