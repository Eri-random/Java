package com.ar.tipos_clases.funcional;

@FunctionalInterface
/*Puede tener métodos default o static, pero solo un método abstracto. */
/*Se pueden usar expresiones lambda para implementarlas.*/
public interface Operacion {
    int calcular(int a, int b);
}
