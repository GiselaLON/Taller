public class Cuadrado extends FiguraGeometrica {

    private  float lado;

    public Cuadrado(String nombre, String color, float lado) {
        super(nombre, color);
        this.lado = lado;
    }

    
    public float getLado() {
        return lado;
    }
    public void setLado(float lado) {
        this.lado = lado;
    }
}
