package org.ies.employees;

 public class ProductManager extends Empleados {
    private String proyecto;

    public ProductManager(String nif, String nombre, String apellidos, int horasTrabajadas, String proyecto) {
        super(nif, nombre, apellidos, horasTrabajadas);
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }
}