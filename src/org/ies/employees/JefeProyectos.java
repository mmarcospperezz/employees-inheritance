package org.ies.employees;

 public class JefeProyectos extends Empleados {
    private String[] proyectos;

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
}
