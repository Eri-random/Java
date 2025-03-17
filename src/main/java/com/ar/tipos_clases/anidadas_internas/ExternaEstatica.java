package com.ar.tipos_clases.anidadas_internas;

public class ExternaEstatica {
    private static String mensaje = "Hola desde la clase externa estática";

    // Clase interna estática
    static class InternaEstatica {
        public void mostrarMensaje() {
            // Accede a los miembros estáticos de la clase externa
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        // Crear instancia de la clase interna estática sin necesidad de una instancia de Externa
        ExternaEstatica.InternaEstatica interna = new ExternaEstatica.InternaEstatica();
        interna.mostrarMensaje();  // Muestra: "Hola desde la clase externa estática"
    }
}
