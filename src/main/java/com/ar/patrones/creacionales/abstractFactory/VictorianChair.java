package com.ar.patrones.creacionales.abstractFactory;

public class VictorianChair implements IChair{
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }
}
