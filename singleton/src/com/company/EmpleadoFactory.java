package com.company;

// SINGLETON: atributo estático, constructor privado y getInstance()
    // Toda factory usa Singleton, no todo Singleton usa factory

public class EmpleadoFactory {

    // Constantes para el método crearEmpleado
    public static final String CODIGO_EMPLEADO_RELACION = "EMP-RD";
    public static final String CODIGO_EMPLEADO_POR_HORA = "EMP-PH";
    //Singleton: Atributos static
    //En el Singleton va a haber una única instancia de la misma clase, se pone como atributo
    // static significa que existe uno solo y se subraya en el UML todo lo estático
    private static EmpleadoFactory instance;

    //Singleton: Constructor privado
    private EmpleadoFactory(){
    }

    // Método público que va a devolver la instancia de tipo EmpleadoFactory
    //También es estático y se subraya en el UML
    public static EmpleadoFactory getInstance() {
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    // MÉTODO DE LA FACTORY que va en el UML
    //El que va a crear las nuevas instancias es la fabrica de empleados
    public Empleado crearEmpleado(String codigo){
        switch (codigo) {
            case CODIGO_EMPLEADO_RELACION :
                //crear empleado en relacion de dependencia
                return new EmpleadoRelacionDependencia();
            case CODIGO_EMPLEADO_POR_HORA:
                // crear y retornar un empleado por hora
                return new EmpleadoPorHora();
            default:
                return null;
        }
    }
}
