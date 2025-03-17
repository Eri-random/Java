package com.ar.tipos_clases.anidadas_internas;

class Externa {
    private String mensaje = "Hola desde la clase interna";

    class Interna {
        public void mostrarMensaje() {
            System.out.println(mensaje);
        }
    }

    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
