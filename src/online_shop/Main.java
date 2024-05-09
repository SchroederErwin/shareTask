package oop.online_shop;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("right around the corner 7","67342","atlantis");
        Order order = new Order(1,"ticket",address,address);
        System.out.println(order.toString());
        //toString calls toString for other objects as well
    }
}
