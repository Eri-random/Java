package com.ar.patrones_guru.creacionales.factory;

public class Truck extends Logistics implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Entrega por tierra en una caja");
    }

    @Override
    public ITransport createTransport() {
        return new Truck();
    }
}
