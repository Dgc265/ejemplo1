package figuras;

public class Circulo extends Figura {

    public Circulo(double x, double y) {
        super(x, y);
    }

    private double radio;

    public Circulo() {
    }

    Circulo(double radio) {
        super();          // llamada al constructor de Figura 
        this.radio = radio;
    }

    Circulo(double x, double y, double radio) {
        super(x, y);      // llamada al constructor de Figura 
        this.radio = radio;
    }

    public double area() {
        return Math.PI * radio * radio;
    }

    public String coordenadas() {
        return "(" + x + "," + y + ")";
    }

    
  // ***************** get/set **************
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
   
}
