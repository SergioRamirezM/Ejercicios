package com.practicas.ejercicioTema4;

public class Main {
    public static void main(String[] args){

        int numeroIf = 23;
        int numeroWhile = 0;
        String estacion = "Otoño";

        if (numeroIf > 0){
            System.out.println("El número es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El número es negativo");
        }else {
            System.out.println("El número es 0");
        }

        while (numeroWhile < 3){
            //numeroWhile = numeroWhile + 1;
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        }while (numeroWhile < 3);

        for (int numeroFor = 0;numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        switch (estacion){
            case "VERANO":
            case "Verano":
            case "verano":
                System.out.println("Es verano");
                break;
            case "PRIMAVERA":
            case "Primavera":
            case "primavera":
                System.out.println("Es primavera");
                break;
            case "OTOÑO":
            case "Otoño":
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "INVIERNO":
            case "Invierno":
            case "invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Ingrese estación");
        }
    }
}