package com.ar.patrones_guru.comportamiento.observer;

public class DemoObserver {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListenerI("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListenerI("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
