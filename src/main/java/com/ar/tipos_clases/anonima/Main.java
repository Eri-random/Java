package com.ar.tipos_clases.anonima;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal() {  // Se usa una clase anónima
            public void hacerSonido() {
                System.out.println("¡Miau!");
            }

            @Override
            public void comer() {
                System.out.println("voy a comer");
            }
        };

        gato.hacerSonido(); // Salida: ¡Miau!
    }
}
