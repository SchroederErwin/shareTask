package oop.interfaces;

import java.util.Arrays;

public class Computershop {
    String name;
    Products[] inventoryList;

    public Computershop(String name, Products[] inventoryList) {
        this.name = name;
        this.inventoryList = inventoryList;
    }

    @Override
    public String toString() {
        return "Computershop{" +
                "name='" + name + '\'' +
                ", inventoryList=" + Arrays.toString(inventoryList) +
                '}';
    }

    public void describeComponents(){
        for (Products p : inventoryList) {
            p.describe();
        }
    }
}
