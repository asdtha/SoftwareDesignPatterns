# JavaDesignPatterns

Ejercicio de Patrón Facade
Objetivo
Realizar el diagrama UML y programar en Java, implementando patrón Facade según el siguiente enunciado:

Enunciado
Supongamos que tenemos que programar un sistema de cálculo de descuento en un supermercado.
Hay descuentos acumulables (se suman los porcentajes) según:
●	Por tarjeta: si es del banco Star Bank tiene un 20% de descuento extra.
●	Por tipo de producto: las latas tienen un 10% de descuento.
●	Por cantidad: si compran más de 12 hay un descuento del 15%.
Cada política de descuento está implementada en una API diferente:
1.	ApiTarjeta: int descuento(Tarjeta)
2.	ApiProducto: int descuento(Producto)
3.	ApiCantidad: int descuento(cantidad) 
Por lo cual se implementará una fachada que permita exponer el cálculo de descuento de alto nivel que utilice las diferentes api.
Hay que modelar también las clases: 
●	Producto: nombre String y tipo String
●	Tarjeta: número String y banco String
Utilizando el patrón Facade se quiere hacer una fachada que permita simplificar el cálculo de descuento con producto, tarjeta y cantidad como parámetros.

