package org.ies.employees;

import java.util.Objects;

public class ProductManager extends Empleados {
    private String proyecto;

    public ProductManager(String nif, String nombre, String apellidos, int horasTrabajadas, String proyecto) {
        super(nif, nombre, apellidos, horasTrabajadas);
        this.proyecto = proyecto;
    }

    public String getProyecto() {
        return proyecto;
    }

     public void setProyecto(String proyecto) {
         this.proyecto = proyecto;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductManager that = (ProductManager) o;
        return Objects.equals(proyecto, that.proyecto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), proyecto);
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "proyecto='" + proyecto + '\'' +
                '}';
    }
}