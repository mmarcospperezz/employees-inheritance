package org.ies.employees;

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
    }
