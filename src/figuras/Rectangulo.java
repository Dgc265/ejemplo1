
package figuras;

public class Rectangulo extends Figura{ 
  
    private double base, altura; 
  
   Rectangulo(double base, double altura) {
     this.base = base; 
     this.altura= altura;
   } 
   
   public String coordenadas(){
      return "(" + x + ","+ y + ")";
   }

   public double area(){   
      return base * altura; 
   } 
   

//****************** get/set ******************

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
