package com.ar.tipos_clases.enums;

//enum puede implementar interfaz
// clase final, no se puede heredar
// extiende de una clase Enum
public enum DiaSemana {
    LUNES("Inicio de la semana laboral"),
    MARTES("Segundo día de la semana"),
    MIERCOLES("Mitad de la semana"),
    JUEVES("Cerca del fin de semana"),
    VIERNES("Último día laboral"),
    SABADO("Día de descanso"),
    DOMINGO("Día familiar");

    // FINAL no puede cambiar su valor despues de ser asignado
    private final String descripcion; // Atributo para cada día

    /* Constructor del enum (privado por defecto). Accesible dentro del mismo paquete
    Se usa para inicializar atributos de cada constante.*/
    DiaSemana(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }

    // Método que verifica si es un día laboral
    public boolean esLaboral() {
        return this != SABADO && this != DOMINGO;
    }

    // Método estático que obtiene un día por nombre
    public static DiaSemana obtenerPorNombre(String nombre) {
        try {
            return DiaSemana.valueOf(nombre.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Día inválido: " + nombre);
            return null;
        }
    }

    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.MIERCOLES;

        System.out.println("Hoy es " + hoy + ": " + hoy.getDescripcion());
        System.out.println("¿Es laboral? " + hoy.esLaboral());

        // Prueba de método estático
        DiaSemana dia = DiaSemana.obtenerPorNombre("Viernes");
        System.out.println("Día obtenido: " + (dia != null ? dia.getDescripcion() : "No válido"));
    }
}
