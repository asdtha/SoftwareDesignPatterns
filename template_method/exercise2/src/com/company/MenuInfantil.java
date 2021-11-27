package com.company;

public class MenuInfantil extends Menu{

    private String juguete;
    private double costoJuguete;

    public  MenuInfantil(String descripcion, double precio,String juguete,double costoJuguete)
    {
        super(descripcion,precio);
        this.juguete=juguete;
        this.costoJuguete=costoJuguete;
    }
    @Override
    public void armado() {
        System.out.println(getDescripcion());
        System.out.println(juguete);
    }

    @Override
    public double precioMenu() {
        return super.precioMenu()+costoJuguete;
    }
}
