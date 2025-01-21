package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;

public class Programador extends Empleados {
    private  String[] lenguajesDeProgramacion;

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

     public String[] getLenguajesDeProgramacion() {
         return lenguajesDeProgramacion;
     }

     public void setLenguajesDeProgramacion(String[] lenguajesDeProgramacion) {
         this.lenguajesDeProgramacion = lenguajesDeProgramacion;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programador that = (Programador) o;
        return Objects.deepEquals(lenguajesDeProgramacion, that.lenguajesDeProgramacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(lenguajesDeProgramacion));
    }

    @Override
    public String toString() {
        return "Programador{" +
                "lenguajesDeProgramacion=" + Arrays.toString(lenguajesDeProgramacion) +
                '}';
    }
}