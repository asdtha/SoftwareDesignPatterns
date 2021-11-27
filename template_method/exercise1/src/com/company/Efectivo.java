package com.company;

public class Efectivo extends Empleado{
    private double sueldoBase;
    private double descuentos;
    private double premios;

    public Efectivo(String nombre, String apellido,String nroCuenta,double sueldoBase,double descuentos,double premios)
    {
        super(nombre,apellido,nroCuenta);
        this.sueldoBase=sueldoBase;
        this.descuentos=descuentos;
        this.premios=premios;
    }
    @Override
    public double calculoSueldo() {
        return sueldoBase+premios-descuentos;
    }

    @Override
    public void generarRecibo(double importe) {
        System.out.println("Se genero un recibo impreso");
    }

    @Override
    public void depositar(double importe) {
        System.out.println("Se deposito un importe de " + importe);
    }
}
