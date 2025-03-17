package com.ar.interfaces;

public interface Animal {
    /* toma el atributo como static final*/
    int NUMERO = 0;

    /* -Java8 interfaz solo podia definir metodo abstracto*/
    void hacerSonido();

    /*Los métodos default tienen implementación dentro de la interfaz y
    pueden ser sobrescritos opcionalmente por las clases que implementan la interfaz.*/
    default void dormir() {
        System.out.println("El animal está durmiendo...");
    }

    static void informacion() {
        System.out.println("Todos los animales pertenecen al reino Animalia.");
    }
}
