package com.practicas.ejercicioTema8;

public class Main {
    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setNombre("Sergio");
        persona.setEdad(22);
        persona.setTelefono("3013751814");

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());
    }
}

class Persona{
    String nombre;
    int edad;
    String telefono;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
