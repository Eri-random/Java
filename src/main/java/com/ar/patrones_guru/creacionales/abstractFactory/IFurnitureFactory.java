package com.ar.patrones_guru.creacionales.abstractFactory;

public interface IFurnitureFactory {
    IChair createChair();
    ICoffeTable createCoffeTable();
    ISofa createSofa();
}
