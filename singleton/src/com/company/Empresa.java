package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private String razonSocial;
    private List<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public Double calcularSueldosTotales(){
        //Se crea el acumulador
        Double sueldosTotales = 0.0;
        // For each para iterar una lista: por cada empleado en mi lista de empleadas
        for(Empleado empleado : empleados){
            // Cada empleado sabe calcular su sueldo
            sueldosTotales += empleado.calcularSueldo();
        }
        return sueldosTotales;
    }

}
