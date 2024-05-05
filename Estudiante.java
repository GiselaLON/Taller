import java.time.LocalDate;

public class Estudiante extends Persona {
     /*quinto commit */ 

private String grado;
/*sexto commit */

public Estudiante(String nombre, int edad, LocalDate fechaNacimiento, String grado) {
    super(nombre, edad, fechaNacimiento);
    this.grado = grado;
}

public String getGrado() {
    return grado;
}

public void setGrado(String grado) {
    this.grado = grado;
}

/*septimo commit */

}
