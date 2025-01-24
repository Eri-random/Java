package com.ar.patrones.creacionales.builder;

import com.ar.patrones.creacionales.builder.entity.Car;
import com.ar.patrones.creacionales.builder.entity.Engine;
import com.ar.patrones.creacionales.builder.entity.GPSNavigator;
import com.ar.patrones.creacionales.builder.entity.TripComputer;

public class CarBuilder implements IBuilder{
    private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType type) {

    }

    @Override
    public void setSeats(int seats) {

    }

    @Override
    public void setEngine(Engine engine) {

    }

    @Override
    public void setTransmission(Transmission transmission) {

    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {

    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {

    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
