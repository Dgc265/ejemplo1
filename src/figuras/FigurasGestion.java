package figuras;

public class FigurasGestion {

    public static void main(String[] args) {
        Figura figura2;
        
        
        Figura fig= new Figura();
        System.out.println(fig.toString());
        
        
        Circulo c1 = new Circulo(5.0);
        Rectangulo r1 = new Rectangulo(3.0, 7.0);

      
        System.out.print("Circulo");
        System.out.println(c1.getRadio() + "  centro:" + c1.x + "," + c1.y);
        System.out.print("Rectangulo");
        System.out.println(r1.coordenadas());

        
        Figura figura = new Figura(2.0, 3.5);
        figura2 = figura;	// Correcto, son de la misma clase
        System.out.println("figura2 : " + figura2.x + "," + figura2.y);

        Circulo circulo = new Circulo(1.6, 2.5, 4.0);
        figura2 = circulo;  // Correcto, circulo es derivado de Figura
        System.out.println("figura2: " + figura2.x + "," + figura2.y);

        Figura f = new Circulo(1.6, 2.5, 4.0);
        Figura f2 = new Rectangulo(5.0, 7.0);

        if (f instanceof Circulo) {
            System.out.println("f es un circulo");
            Circulo c= (Circulo) f;
            System.out.println(" este es su radio " + c.getRadio());            
        }

        if (f2 instanceof Rectangulo) {
            System.out.println(" f2 es un rectangulo");
            Rectangulo r = (Rectangulo) f2;
            System.out.println("su base:" + r.getBase() + " su altura:" + r.getAltura());
        }

    }

}
