package org.ies.employees;

 public class Programador extends Empleados {
    private String[] lenguajesDeProgramacion;

    public Programador(String nif, String nombre, String apellidos, int horasTrabajadas, String[] lenguajesDeProgramacion) {
        super(nif, nombre, apellidos, horasTrabajadas);
        this.lenguajesDeProgramacion = lenguajesDeProgramacion;
    }

    public boolean conoceLenguaje(String lenguaje) {
        for (String l : lenguajesDeProgramacion) {
            if (l.equalsIgnoreCase(lenguaje)) {
                return true;
            }
        }
        return false;
    }
}