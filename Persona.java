/**
 * Persona
 */

import java.time.LocalDate;
import java.util.*;
public class Persona {

    private String nombre;
    private int edad;
    private  LocalDate fechaNacimiento;

    
    /**
 * primer commit
 */


    /*metodo constructor */
    public Persona(String nombre, int edad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }

    
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        if (nombre == null) {
            System.out.println("No se permite el campo vacio");
        } else {
            this.nombre = nombre;
        }   

    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        if (edad <= 0) {
            System.out.println("Error en la edad, ponla en positivo");
        } else {
            this.edad = edad;
        }

    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
        System.out.println("No se permite el campo vacio de la fecha de nacimiento");
        } else {
        this.fechaNacimiento = fechaNacimiento;
        }  

    }
/*
 * Tercer commit
 */

}





