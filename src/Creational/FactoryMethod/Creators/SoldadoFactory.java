package Creational.FactoryMethod.Creators;

import Creational.FactoryMethod.Products.Soldado;
import Creational.FactoryMethod.Products.Tropa;

public class SoldadoFactory implements TropaFactory {

    @Override
    public Tropa crearTropa() {
        return new Soldado();
    }
}
