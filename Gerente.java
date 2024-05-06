public class Gerente extends Empleados {
    
    private float bono;
    private float horas;
    private float v_horas;
    
    
    public Gerente(String nombre, float salario, float horas, float v_horas, float bono) {
        super(nombre, salario);
        this.bono = bono;
        this.horas = horas;
        this.v_horas= v_horas;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }
    public float calcularSalario(){
        return  (horas*v_horas)+bono;
    }
}
