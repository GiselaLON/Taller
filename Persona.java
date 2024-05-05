/**
 * Persona
 */

import java.time.LocalDate;
import java.util.*;
public class Persona {

    private String nombre;
    private int edad;
    private Date fechaNacimiento;

    
    /**
 * primer commit
 */


    /*metodo constructor */
    public Persona(String nombre, int edad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
/**
 * Segundo commit
 */




}