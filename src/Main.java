import org.ies.employees.DirectorTecnologia;
import org.ies.employees.JefeProyectos;
import org.ies.employees.JefeProyectos;
import org.ies.employees.ProductManager;
import org.ies.employees.Programador;

public class Main {
    public static void main(String[] args) {
        Programador programador = new Programador("12345678A", "Ana", "García", 40, new String[]{"Java", "Python", "C++"});
        programador.mostrarInformacion();
        System.out.println("Conoce Java: " + programador.conoceLenguaje("Java"));
        System.out.println("Conoce Ruby: " + programador.conoceLenguaje("Ruby"));
        programador.imputarHoras(5);
        programador.mostrarInformacion();

        JefeProyectos jefe = new JefeProyectos("23456789B", "Luis", "Pérez", 50, new String[]{"Proyecto A", "Proyecto B"});
        jefe.mostrarInformacion();
        System.out.println("Dirige Proyecto A: " + jefe.dirigeProyecto("Proyecto A"));
        System.out.println("Dirige Proyecto C: " + jefe.dirigeProyecto("Proyecto C"));
        jefe.imputarHoras(10);
        jefe.mostrarInformacion();

        ProductManager pm = new ProductManager("34567890C", "María", "López", 60, "Proyecto X");
        pm.mostrarInformacion();
        System.out.println("Proyecto asignado: " + pm.getProyecto());
        pm.imputarHoras(8);
        pm.mostrarInformacion();

        DirectorTecnologia director = new DirectorTecnologia("45678901D", "Carlos", "Sánchez", 70);
        director.mostrarInformacion();
        director.imputarHoras(15);
        director.mostrarInformacion();
    }
}