package com.ar.patrones.creacionales.builder;

import com.ar.patrones.creacionales.builder.entity.Engine;
import com.ar.patrones.creacionales.builder.entity.GPSNavigator;
import com.ar.patrones.creacionales.builder.entity.TripComputer;

public interface IBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
