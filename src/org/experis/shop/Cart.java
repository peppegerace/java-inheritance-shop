package org.experis.shop;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Quanti prodotti vuoi aggiungere? ");
        int size = Integer.parseInt(scan.nextLine());
        Product[] cart = new Product[size];

        for (int i = 0; i < cart.length; i++) {
            System.out.println("Che tipo di prodotto vuoi aggiungere?");
            System.out.println("1. Aggiungi uno smartphone");
            System.out.println("2. Aggiungi un televisore");
            System.out.println("3. Aggiungi un paio di cuffie");
            System.out.print("Inserire un numero valido: ");

            int choise = Integer.parseInt(scan.nextLine());

            System.out.print("Nome prodotto: ");
            String name = scan.nextLine();
            System.out.print("Marca: ");
            String brand = scan.nextLine();
            System.out.print("Prezzo: ");
            String price = scan.nextLine();
            System.out.print("Iva: ");
            String vat = scan.nextLine();

            switch (choise) {
                case 1:
                    System.out.print("Codice IMEI: ");
                    String imei = scan.nextLine();

                    System.out.print("Memoria (in GB): ");
                    int memorySize = Integer.parseInt(scan.nextLine());

                    Smartphone smartphone = new Smartphone(name, brand, new BigDecimal(price), new BigDecimal(vat), imei, memorySize);
                    cart[i] = smartphone;
                    break;
                case 2:
                    System.out.print("Dimensione (in pollici): ");
                    int screenSize = Integer.parseInt(scan.nextLine());

                    System.out.print("È smart TV? (digitare true o false) ");
                    boolean isSmart = scan.nextBoolean();

                    Television television = new Television(name, brand, new BigDecimal(price), new BigDecimal(vat), screenSize, isSmart);
                    cart[i] = television;
                    break;
                case 3:
                    System.out.print("Colore: ");
                    String color = scan.nextLine();

                    System.out.print("Sono wireless?" );
                    boolean isWireless = scan.nextBoolean();

                    Headphones headphones = new Headphones(name, brand, new BigDecimal(price), new BigDecimal(vat), color, isWireless);
                    cart[i] = headphones;
                    break;
                default:
                    break;
            }
        }

        for (Product product : cart) {
            System.out.println(product.productDetails());
        }

        System.out.println(Arrays.toString(cart));

        scan.close();
    }
}
