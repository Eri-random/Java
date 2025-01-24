package com.ar.patrones.creacionales.factory;

import com.ar.patrones.creacionales.factory.ITransport;
import com.ar.patrones.creacionales.factory.Logistics;

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
