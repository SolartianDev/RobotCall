package com.streams.practica;

// Clase que contiene métodos para enviar correos electrónicos y mensajes de texto a empleados
public class RoboMail {

    // Método para enviar un correo electrónico a un empleado dado
    public void roboMail(Empleado p) {
        // Imprime un mensaje indicando que se está enviando un correo con la información del empleado
        System.out.println("Enviando Email: " + p.getPrimerNombre()
            + " " + p.getSegundoNombre() + " edad " + p.getEdad()
            + " al " + p.getEmail());
    }

    // Método para enviar un mensaje de texto a un empleado dado
    public void roboText(Empleado p) {
        // Imprime un mensaje indicando que se está enviando un mensaje de texto con la información del empleado
        System.out.println("Enviando texto: " + p.getPrimerNombre()
            + " " + p.getSegundoNombre() + " edad " + p.getEdad()
            + " al " + p.getTelefono());
    }
}

