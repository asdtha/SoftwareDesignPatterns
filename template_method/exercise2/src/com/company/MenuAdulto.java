package com.company;

public class MenuAdulto extends Menu{

    public MenuAdulto(String descripcion, double precio)
    {
        super (descripcion, precio);
    }
    @Override
    public void armado() {
        System.out.println(getDescripcion());
    }

}
