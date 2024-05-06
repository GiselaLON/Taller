public class Empleados {
    private String Nombre;
    private float Salario;
    public Empleados(String nombre, float salario) {
        Nombre = nombre;
        Salario = salario;
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
}
