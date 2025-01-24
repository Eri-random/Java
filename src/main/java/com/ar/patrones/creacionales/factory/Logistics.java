package com.ar.patrones.creacionales.factory;

import com.ar.patrones.creacionales.factory.ITransport;

public abstract class Logistics {
    abstract ITransport createTransport();
}
