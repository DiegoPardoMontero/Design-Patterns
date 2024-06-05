package Creational.FactoryMethod.Creators;

import Creational.FactoryMethod.Products.Avion;
import Creational.FactoryMethod.Products.Soldado;
import Creational.FactoryMethod.Products.Tanque;
import Creational.FactoryMethod.Products.Tropa;

public class TropaAleatoriaFactory implements TropaFactory {

    @Override
    public Tropa crearTropa() {
        double number = Math.random();
        if(number > 0.66){
            return new Avion();
        }
        else if(number > 0.33){
            return new Tanque();
        }
        else{
            return new Soldado();
        }
    }
}
