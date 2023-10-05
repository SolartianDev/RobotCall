package com.streams.practica;

import java.util.List;
import java.util.function.Predicate;

// Clase que realiza pruebas de envío de correos electrónicos y mensajes de texto a empleados
public class RoboMailTest {
    public static void main(String[] args) {
        
        // Crea una lista de empleados utilizando el método estático "crearLista" de la clase "Empleado"
        List<Empleado> pl = Empleado.crearLista();
        
        // Crea una instancia de la clase "RoboMail" para enviar correos electrónicos y mensajes de texto
        RoboMail robot = new RoboMail();
        
        // Predicado que filtra a los empleados que son ejecutivos en el departamento de ventas
        Predicate<Empleado> ejecutivos =
           p -> p.getRol().equals(Rol.EJECUTIVO)
               && p.getDeptLaboral().equals("Ventas");
       
        // Predicado que filtra a los empleados de ventas mayores o iguales a 50 años
        Predicate<Empleado> ventasEmpleadoMayorsde50 = 
               p -> p.getEdad() >= 50 && p.getDeptLaboral().equals("Ventas");
       
        // Imprime encabezados informativos
        System.out.println("\n\t\t==== RoboMail ====");
        System.out.println("\n==== Ventas ====");
        
        // Filtra y envía correos electrónicos a los ejecutivos del departamento de ventas
        pl.stream()
                .filter(ejecutivos)
                .forEach(p -> robot.roboMail(p));
        
        // Filtra y envía mensajes de texto a los empleados de ventas mayores o iguales a 50 años
        pl.stream()
                .filter(ventasEmpleadoMayorsde50)
                .forEach(p-> robot.roboText(p));
       
        // Filtra y envía correos electrónicos a los empleados de ingeniería masculinos mayores o iguales a 65 años
        pl.stream()
               .filter(p->p.getEdad()>=65)
               .filter(p -> p.getDeptLaboral().equals("Ingenieria"))
               .filter(p-> p.getGenero().equals(Genero.MASCULINO))
               .forEach(p->robot.roboMail(p));
    }
}
