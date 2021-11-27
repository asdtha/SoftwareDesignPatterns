package com.company;

public class Main {

    public static void main(String[] args) {
        double total=0;
        MenuVegetariano menu1=new MenuVegetariano("Esalada",400,50);
        MenuAdulto menu2=new MenuAdulto("Hamburguesa completa",500);
        total+=menu1.preparacion();
        total+=menu2.precioMenu();
        System.out.println("Total de la compra " + total);


    }
}
