

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


    public float calcularArea(){
        return this.lado*this.lado;
    }
    public float calcularPerimetro(){
        return this.lado*4;
    }
}
