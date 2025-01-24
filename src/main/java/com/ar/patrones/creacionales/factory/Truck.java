package com.ar.patrones.creacionales.factory;

import com.ar.patrones.creacionales.factory.ITransport;
import com.ar.patrones.creacionales.factory.Logistics;

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
