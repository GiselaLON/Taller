public class Vendedor extends Empleados {

    private float ventas;
    private float horas;
    private float v_horas;
    
    public Vendedor(String nombre, float salario, float ventas, float horas, float v_horas) {
        super(nombre, salario);
        this.ventas = ventas;
        this.horas = horas;
        this.v_horas = v_horas;
    }
    public float getVentas() {
        return ventas;
    }
    public void setVentas(float ventas) {
        this.ventas = ventas;
    }
    public float getHoras() {
        return horas;
    }
    public void setHoras(float horas) {
        this.horas = horas;
    }
    public float getV_horas() {
        return v_horas;
    }
    public void setV_horas(float v_horas) {
        this.v_horas = v_horas;
    }
    
}
