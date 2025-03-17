package com.ar.patrones_guru.creacionales.factory;

public class Ship extends Logistics implements ITransport {
    @Override
    public void deliver() {
        System.out.println("Entrega por mar en un contenedor");
    }

    @Override
    public ITransport createTransport() {
        return new Ship();
    }
}
