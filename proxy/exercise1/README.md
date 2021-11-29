# Java Design Patterns exercises

Enunciado
En un centro de vacunación las personas inscriptas y con turno, además de conocer su nombre, apellido y DNI, tienen asignada una fecha de vacunación, y la vacuna que se les aplicará.  
Pueden concurrir un día posterior a la a fecha asignada, por lo cual cuando se vacuna es necesario informar mediante el método vacunar() que esta ya fue aplicada. En el momento de la vacunación se debe registrar la confirmación con el DNI, fecha y vacuna.  Para evitar que la información sea inconsistente se debe controlar que la fecha sea igual o posterior a la fecha asignada. Se debe utilizar un proxy para efectuar este control.
Para simplificar el ejercicio, si el registro es correcto se emite un mensaje con la información registrada.
