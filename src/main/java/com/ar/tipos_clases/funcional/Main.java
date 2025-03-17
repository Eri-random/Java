package com.ar.tipos_clases.funcional;

public class Main {
    public static void main(String[] args) {
        // Implementación con una clase anónima
        Operacion suma1 = new Operacion() {
            @Override
            public int calcular(int a, int b) {
                return a + b;
            }
        };

        // Implementación con una expresión lambda
        Operacion suma2 = (a, b) -> a + b;

        System.out.println(suma1.calcular(5, 3)); // 8
        System.out.println(suma2.calcular(10, 4)); // 14
    }
}
