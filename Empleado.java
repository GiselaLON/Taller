import java.time.LocalDate;


public class Empleado extends Persona implements Trabajador {

    public Empleado(String nombre, int edad, LocalDate fechaNacimiento) {
        super(nombre, edad, fechaNacimiento);
        
    }


    public void realizarTarea() {
        System.out.println("Realizando tarea Laboral");
    }

}
