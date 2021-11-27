package com.company;

public class MenuVegetariano extends Menu{
   private double costoEnvase;

   public MenuVegetariano(String descripcion, double precio,double costoEnvase)
   {
       super(descripcion,precio);
       this.costoEnvase=costoEnvase;
   }
    @Override
    public void armado() {
        System.out.println("Lleva envase espcial y condimentos");

    }

    @Override
    public double precioMenu() {
        return super.precioMenu()+costoEnvase + super.precioMenu() *0.01;
    }
}
