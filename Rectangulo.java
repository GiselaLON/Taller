public class Rectangulo extends FiguraGeometrica{
    private Float ancho;
    private Float largo;
    
    public Rectangulo(String nombre, String color, Float ancho, Float largo) {
        super(nombre, color);
        this.ancho = ancho;
        this.largo = largo;
    }
    public Float getAncho() {
        return ancho;
    }
    public void setAncho(Float ancho) {
        this.ancho = ancho;
    }
    public Float getLargo() {
        return largo;
    }
    public void setLargo(Float largo) {
        this.largo = largo;
    }
}
