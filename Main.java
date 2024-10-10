import Products.Laptop;
import Products.Os;

import java.util.HashMap;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store storeOne = new Store();
        Os noOs = new Os("none", "noOs", "none");
        Os windows11 = new Os("11", "Windows", "MicroSoft");
        Os linux = new Os("24.04", "Ubuntu", "Open");
        Os macOs = new Os("15", "Macos", "Apple");
        Laptop first = new Laptop("SSD", 512, "DDR4",
                16, noOs, "hp", 55000,"black",
                15.6, "Ryzen");
        Laptop second = new Laptop("SSD", 256, "DDR4",
                8, windows11, "lenovo", 48000,"gray",
                15.6, "Intel");
        Laptop third = new Laptop("SSD", 512, "DDR5",
                16, windows11, "Xiaomi", 65000,"black",
                15.6, "Ryzen");
        Laptop fourth = new Laptop("SSD", 512, "DDR4",
                16, macOs, "Apple", 99000,"black",
                15.6, "M10");
        Laptop fives = new Laptop("SSD", 512, "DDR5",
                16, windows11, "hp", 75000,"black",
                15.6, "Intel");
        Laptop sixes = new Laptop("SSD", 512, "DDR4",
                16, linux, "lenovo", 64000,"black",
                15.6, "Ryzen");
        storeOne.addProduct(first);
        storeOne.addProduct(second);
        storeOne.addProduct(third);
        storeOne.addProduct(fourth);
        storeOne.addProduct(fives);
        storeOne.addProduct(sixes);
        System.out.println(storeOne.getProducts());
        HashMap<Integer, String> filter = new HashMap<>();
        filter.put(1, "ОЗУ");
        filter.put(2, "Объем ЖД");
        filter.put(3, "Операционная система");
        filter.put(4, "Цвет");
        filter.put(5, "Процессор");
        System.out.println("Выберите фильтр");
        for (int i = 1; i < filter.size()+1; i++) {
            System.out.println(i + ". " + filter.get(i));
        }
        String answer = System.console().readLine().trim();
        switch (Integer.parseInt(answer)){
            case 1:

        }
    }

}