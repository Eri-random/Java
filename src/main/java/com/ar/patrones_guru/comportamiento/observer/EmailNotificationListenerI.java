package com.ar.patrones_guru.comportamiento.observer;

import java.io.File;

public class EmailNotificationListenerI implements IEventListener {
    private String email;

    public EmailNotificationListenerI(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }
}
