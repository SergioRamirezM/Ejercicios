package com.practicas.ejercicioTema3;

public class Main {

    public static void main(String[] args) {

        int resultado = sumarNumeros(4,3,5);
        System.out.println(resultado);

        Coche miCoche = new Coche();
        miCoche.aumentarPuertas();
        System.out.println(miCoche.puertas);
    }

    public static int sumarNumeros (int a, int b, int c){
        return a + b + c;
    }

}

class Coche{
    int puertas;

    public void aumentarPuertas(){
        this.puertas = this.puertas + 1;
    }
}
