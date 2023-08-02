package com.practicas.ejercicioTema9;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        cliente.nombre= "Sergio";
        cliente.edad= 22;
        cliente.telefono="3106991233";
        cliente.credito=1000000;
        System.out.println(cliente.nombre);
        System.out.println(cliente.edad);
        System.out.println(cliente.telefono);
        System.out.println(cliente.credito);

        System.out.println(" ");
        
        Trabajador trabajador = new Trabajador();
        trabajador.nombre= "Steven";
        trabajador.edad= 30;
        trabajador.telefono="31";
        trabajador.salario=2000000;
        System.out.println(trabajador.nombre);
        System.out.println(trabajador.edad);
        System.out.println(trabajador.telefono);
        System.out.println(trabajador.salario);
    }
}

class Persona{

    String nombre;
    int edad;
    String telefono;
}

class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int salario;
}
