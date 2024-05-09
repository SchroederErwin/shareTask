package oop.interfaces;

public class Main {
    public static void main(String[] args) {
        Products[] products= new Products[]{new Processor("Intel",3400),new Processor("AMD",5600),new Keyboard("Logitech","QWERTY"), new Monitor("acer",27)};
        Computershop shop = new Computershop("Base128",products);
        //System.out.println(shop.toString());
        shop.describeComponents();
    }

}
