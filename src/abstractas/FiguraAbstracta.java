package abstractas;

public abstract class FiguraAbstracta {

    private double x, y;

    public FiguraAbstracta() {
        this.x=0;
        this.y=0;
    }

    
    
    FiguraAbstracta(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método abstracto, sin implementacion
    public abstract double area();

    
    public String coordenadas() {
        return "(" + x + "," + y + ")";
    }
}
