
package abstractas;


public class Rectangulo extends FiguraAbstracta{
 
   private double base, altura; 

   Rectangulo(double x, double y, double base, double altura) {	
     super(x,y);
     this.base = base;
     this.altura = altura;
   }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
   
   

   @Override
   public double area(){
      return (base * altura); 
   } 

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
   
   
}

