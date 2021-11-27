package com.company;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Comprable> productos;

    public Carrito() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Comprable comprable){
        productos.add(comprable);
    }

    public Double calcularPrecio(){
        Double sumaTotal = 0.0;
        for (Comprable comprable : productos) {
            sumaTotal += comprable.informarPrecio();
        }
        return sumaTotal;
    }
}
