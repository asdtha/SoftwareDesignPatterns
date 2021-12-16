package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    // Así agarro la instancia única de mi fábrica
    // Yo podría crear (aunque nunca se hace) otra variable y volver a llamar al método pero seguiría siendo la misma fábrica única
    EmpleadoFactory empleadoFactory = EmpleadoFactory.getInstance();

    Empresa empresa = new Empresa("C4 S.A");

    empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_POR_HORA));
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-PH"));
    empresa.agregarEmpleado(empleadoFactory.crearEmpleado("EMP-RD"));

        System.out.println(empresa.calcularSueldosTotales());





    }
}
