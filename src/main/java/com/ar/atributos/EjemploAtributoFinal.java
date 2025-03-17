package com.ar.atributos;

public class EjemploAtributoFinal {
    //Si no lo inicializas en la declaración ni en el constructor, el código no compilará.
    public final int numeroInstancia;        // Se asigna en el constructor

    public static final double GRAVEDAD = 9.8; // Constante de clase

    public int variableNormal = 10;          // Se puede modificar

    public EjemploAtributoFinal(int numero) {
        this.numeroInstancia = numero;
    }

    public static void main(String[] args) {
        EjemploAtributoFinal obj1 = new EjemploAtributoFinal(100);
        EjemploAtributoFinal obj2 = new EjemploAtributoFinal(200);

        System.out.println(obj1.numeroInstancia); // 100
        System.out.println(obj2.numeroInstancia); // 200

        // Intentar modificarlo dará error
        // obj1.numeroInstancia = 300; // ERROR: cannot assign a value to final variable

        // No se puede cambiar GRAVEDAD porque es constante
        // Error de compilacion
        //GRAVEDAD = 10; // ❌ ERROR

        // Se puede cambiar variableNormal
        obj1.variableNormal = 50;
        System.out.println(obj1.variableNormal); // 50
    }
}
