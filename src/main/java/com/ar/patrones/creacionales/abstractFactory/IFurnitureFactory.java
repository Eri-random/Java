package com.ar.patrones.creacionales.abstractFactory;

public interface IFurnitureFactory {
    IChair createChair();
    ICoffeTable createCoffeTable();
    ISofa createSofa();
}
