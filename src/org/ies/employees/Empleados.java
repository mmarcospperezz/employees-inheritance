package org.ies.employees;

import java.util.Objects;

public abstract class Empleados {
        private String nif;
        private String nombre;
        private String apellidos;
        private int horasTrabajadas;

    public Empleados(String nif, String nombre, String apellidos, int horasTrabajadas) {
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.horasTrabajadas = horasTrabajadas;
    }

    public void mostrarInformacion() {
            System.out.println("NIF: " + nif);
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Horas trabajadas: " + horasTrabajadas);
        }

        public void imputarHoras(int horas) {
            if (horas > 0) {
                this.horasTrabajadas += horas;
            }
        }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empleados empleados = (Empleados) o;
        return horasTrabajadas == empleados.horasTrabajadas && Objects.equals(nif, empleados.nif) && Objects.equals(nombre, empleados.nombre) && Objects.equals(apellidos, empleados.apellidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nif, nombre, apellidos, horasTrabajadas);
    }
}
