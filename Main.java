import Products.Laptop;
import Products.Os;
import Products.Product;

import java.util.HashMap;
import java.util.LinkedHashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store storeOne = new Store();
        Os noOs = new Os("none", "noOs", "none");
        Os windows11 = new Os("11", "Windows", "MicroSoft");
        Os linux = new Os("24.04", "Ubuntu", "Open");
        Os macOs = new Os("15", "Macos", "Apple");
        Os aurora = new Os("2.5", "Aurora", "ОМП" );
        Laptop first = new Laptop("SSD", 512, "DDR4",
                16, noOs.getName(), "hp", 55000,"black",
                15.6, "Ryzen");
        Laptop second = new Laptop("SSD", 256, "DDR4",
                8, windows11.getName(), "lenovo", 48000,"gray",
                15.6, "Intel");
        Laptop third = new Laptop("SSD", 512, "DDR5",
                16, windows11.getName(), "Xiaomi", 65000,"black",
                15.6, "Ryzen");
        Laptop fourth = new Laptop("SSD", 512, "DDR4",
                16, macOs.getName(), "Apple", 99000,"silver",
                15.6, "M10");
        Laptop fives = new Laptop("SSD", 512, "DDR5",
                16, windows11.getName(), "hp", 75000,"black",
                15.6, "Intel");
        Laptop sixes = new Laptop("SSD", 512, "DDR4",
                16, linux.getName(), "lenovo", 64000,"black",
                15.6, "Ryzen");
        Laptop seventh = new Laptop("SSD", 512, "DDR4",
                16, aurora.getName(), "МЦСТ", 105000,"black",
                15.6, "Эльбрус-8СВ");
        storeOne.addProduct(noOs);
        storeOne.addProduct(windows11);
        storeOne.addProduct(macOs);
        storeOne.addProduct(linux);
        storeOne.addProduct(aurora);
        storeOne.addProduct(first);
        storeOne.addProduct(second);
        storeOne.addProduct(third);
        storeOne.addProduct(fourth);
        storeOne.addProduct(fives);
        storeOne.addProduct(sixes);
        storeOne.addProduct(seventh);
        System.out.println(storeOne.getProducts());
        HashMap<Integer, String> filter = new HashMap<>();
        filter.put(1, "ОЗУ");
        filter.put(2, "Объем ЖД");
        filter.put(3, "Операционная система");
        filter.put(4, "Цвет");
        filter.put(5, "Процессор");
        filter.put(6, "Выход");
        HashMap<Integer, String> filterColor = new HashMap<>();
        filterColor.put(1, "black");
        filterColor.put(2, "silver");
        filterColor.put(3, "grey");
        filterColor.put(4, "brown");
        System.out.println("Выберите фильтр");
        boolean program = true;
        while (program) {
            System.out.println("Выберите фильтр");
            for (int i = 1; i < filter.size()+1; i++) {
                System.out.println(i + ". " + filter.get(i));
            }
            int answer = Integer.parseInt(System.console().readLine().trim());
            String answer2;
            switch (answer) {
                case 1:
                    System.out.println("Введите минимальный размер ОЗУ");
                    answer2 = System.console().readLine().trim();
                    System.out.println(storeOne.getProducts(answer, answer2));
                    break;
                case 2:
                    System.out.println("Введите минимальный размер ЖД");
                    answer2 = System.console().readLine().trim();
                    System.out.println(storeOne.getProducts(answer, answer2));
                    break;
                case 3: {
                    System.out.println("Выберите операционную систему:");
                    int start = 1;
                    LinkedHashMap<Integer, Os> oss = new LinkedHashMap<>();
                    for (Product product : storeOne.getProducts().keySet()) {
                        if (product.getClass().getSimpleName().equals("Os")) {
                            System.out.println(start + ". " + product.getName());
                            oss.put(start++, (Os) product);
                        }
                    }
                    answer2 = oss.get(Integer.parseInt(System.console().readLine().trim())).getName();
                    System.out.println(storeOne.getProducts(answer, answer2));
                    break;
                }
                case 4:
                    System.out.println("Выберите цвет");
                    for (int i = 1; i < filterColor.size()+1; i++) {
                        System.out.println(i + ". " + filterColor.get(i));
                    }
                    answer2 = filterColor.get(Integer.parseInt(System.console().readLine().trim()));
                    System.out.println(storeOne.getProducts(answer, answer2));
                    break;
                case 5:
                    System.out.println("Выберите процессор");
                    int start = 1;
                    LinkedHashMap<Integer, String> cpu = new LinkedHashMap<>();
                    for (Product product: storeOne.getProducts().keySet()) {
                        if (product.getClass().getSimpleName().equals("Laptop")){
                            Laptop lap = (Laptop) product;
                            if (!cpu.containsValue(lap.getCpu())) {
                                System.out.println(start + ". " + lap.getCpu());
                                cpu.put(start++, lap.getCpu());
                            }
                        }
                    }
                    answer2 = cpu.get(Integer.parseInt(System.console().readLine().trim()));
                    System.out.println(storeOne.getProducts(answer, answer2));
                    break;
                case 6:
                    program = false;
                    break;
            }
        }
    }

}