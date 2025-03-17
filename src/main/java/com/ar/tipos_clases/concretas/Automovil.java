package com.ar.tipos_clases.concretas;

public class Automovil {
    private String marca;
    private String modelo;
    private int anio;

    public Automovil(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void mostrarInfo() {
        System.out.println("Automóvil: " + marca + " " + modelo + " " + anio);
    }

    public class Main {
        public static void main(String[] args) {
            Automovil auto = new Automovil("Toyota", "Corolla", 2023);
            auto.mostrarInfo();
        }
    }
}
