package com.ar.patrones.creacionales.abstractFactory;

public class VictorianFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new VictorianChair();
    }

    @Override
    public ICoffeTable createCoffeTable() {
        return null;
    }

    @Override
    public ISofa createSofa() {
        return null;
    }
}
