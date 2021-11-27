package com.company;

public class Contratado extends  Empleado{
   private double valorHora;
   private int horas;

   public Contratado(String nombre,String apellido,String nroCuenta, double valorHora, int horas)
   {
       super(nombre, apellido,nroCuenta);
       this.valorHora=valorHora;
       this.horas=horas;
   }
    @Override
    public double calculoSueldo() {
        return valorHora*horas;
    }

    @Override
    public void generarRecibo(double importe) {
        System.out.println("Se genero un recibo digital");
    }

    @Override
    public void depositar(double importe) {
        System.out.println("Se deposito un importe de " + importe);
    }
}
