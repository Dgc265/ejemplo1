package abstractas;

import java.util.ArrayList;
import java.util.List;

public class Probando {

    public static void main(String[] args) {

        //Da error porque NO se pueden crear objetos de una clase abstracta
//        FiguraAbstracta f2 = new FiguraAbstracta(1,3);
        FiguraAbstracta figura;

        figura = new Circulo(2, 3, 10);
        System.out.println(figura.area());
        System.out.println(figura.coordenadas());

        figura = new Rectangulo(1, 1, 5, 7);
        System.out.println(figura.area());
        System.out.println(figura.coordenadas());

        // lista de objetos de tipo Figura, permite almacenar juntos objetos de tipo Circulo y Rectangulo
        List<FiguraAbstracta> lista_figuras = new ArrayList<>();

        lista_figuras.add(new Circulo(2, 3, 5));
        lista_figuras.add(new Rectangulo(3, 6));
        lista_figuras.add(new Rectangulo(5, 8));
        lista_figuras.add(new Circulo(7, 7, 5));

        Circulo c;
        Rectangulo r;

        // Recorremos la lista y mostramos los atributos específicos y las áreas 
        for (FiguraAbstracta f : lista_figuras) {

            // getClass() devuelve la clase del objeto f
            String nombreClase = f.getClass().getSimpleName();

            //metodo abstract area(), permite que todos los elementos lo tengan
            System.out.print("Area " + nombreClase + " " + f.area() + "--> ");

            if (f instanceof Circulo) {   //true si f es de la clase Circulo
                //conversion explícita a Circulo para poder acceder a las propiedades especificas
                c = (Circulo) f;
                System.out.println("radio: " + c.getRadio());
            }

            if (f instanceof Rectangulo) {  // true si f es de la clase Rectangulo
                //conversion explícita a Rectangulo para poder acceder a las propiedades especificas
                r = (Rectangulo) f;
                System.out.println("base, altura: " + r.getBase() + "," + r.getAltura());
            }
        } // end for

    }
}
