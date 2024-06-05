package Creational.FactoryMethod.Creators;

import Creational.FactoryMethod.Products.Tropa;

import java.util.Scanner;

public abstract class CampoDeBatalla {
    String nombre;
    Integer[] dimensiones;

    public static void main(String[] args) {
        empezarPartida();
    }
    public static void empezarPartida(){
        System.out.println("Saludos jugador!");
        System.out.println("A continuación, se crearán 5 tropas");

        TropaFactory fabricaTropas = new TropaAleatoriaFactory();
        for(int i = 0; i < 5; i++){
            System.out.println("Tropa numero: " + i);
            Tropa tropa = fabricaTropas.crearTropa();
            tropa.presentacion();
        }
    }

}
