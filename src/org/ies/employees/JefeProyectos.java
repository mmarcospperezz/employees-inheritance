package org.ies.employees;

import java.util.Arrays;
import java.util.Objects;

public class JefeProyectos extends Empleados {
    private  String[] proyectos;

    public JefeProyectos(String nif, String nombre, String apellidos, int horasTrabajadas, String[] proyectos) {
        super(nif, nombre, apellidos, horasTrabajadas);
        this.proyectos = proyectos;
    }

    public boolean dirigeProyecto(String proyecto) {
        for (String p : proyectos) {
            if (p.equalsIgnoreCase(proyecto)) {
                return true;
            }
        }
        return false;
    }

     public String[] getProyectos() {
         return proyectos;
     }

     public void setProyectos(String[] proyectos) {
         this.proyectos = proyectos;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        JefeProyectos that = (JefeProyectos) o;
        return Objects.deepEquals(proyectos, that.proyectos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Arrays.hashCode(proyectos));
    }

    @Override
    public String toString() {
        return "JefeProyectos{" +
                "proyectos=" + Arrays.toString(proyectos) +
                '}';
    }
}
