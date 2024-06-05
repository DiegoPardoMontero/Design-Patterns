package Creational.FactoryMethod.Products;

import Creational.FactoryMethod.Products.Tropa;

public class Soldado implements Tropa {
    @Override
    public void presentacion() {
        System.out.println("En marcha! Aqui soldado valiente");
    }
}
