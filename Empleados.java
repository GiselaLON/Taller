public class Empleados {
    private String Nombre;
    private float Salario;
    private float Horas;


    
    public Empleados(String nombre, float salario, float horas) {
        Nombre = nombre;
        Salario = salario;
        Horas = horas;
    }

    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public float getSalario() {
        return Salario;
    }
    public void setSalario(float salario) {
        Salario = salario;
    }
    public float getHoras() {
        return Horas;
    }
    public void setHoras(float horas) {
        Horas = horas;
    }


    
}
