package com.company;

public abstract class Menu {
    private double precio;
    private String descripcion;
    public Menu(String descripcion, double precio)
    {
        this.descripcion=descripcion;
        this.precio=precio;
    }
    public String getDescripcion()
    {
        return descripcion;
    }
    public double preparacion()
    {
        armado();
        return precioMenu();
    }
    public abstract void armado();
    public double precioMenu()
    {
        return precio;
    }
}
