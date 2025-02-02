package com.ar.patrones.comportamiento.observer;

import java.io.File;
public class LogOpenListenerI implements IEventListener {
    private File log;

    public LogOpenListenerI(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
