package com.ar.patrones_guru.creacionales.abstractFactory;

public class ModernFurnitureFactory implements IFurnitureFactory{
    @Override
    public IChair createChair() {
        return new ModernChair();
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
