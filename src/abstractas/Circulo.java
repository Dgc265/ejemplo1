
package abstractas;


public class Circulo extends FiguraAbstracta{
 
   private double radio; 

   Circulo(double x, double y, double radio) {  	
     super(x,y);
     this.radio = radio;
   }

    public Circulo(double radio) {
        this.radio = radio;
    }

   
    
   @Override    //índica que el método se sobrescribe  
   public double area(){      
      return Math.PI*radio*radio;       
   } 

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
   
   
   
}

