/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author 53253095e
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Figura f1 = new Circulo(1.6,2.5,4.0);
           Figura f2 = new Rectangulo(2.0,5.0);
    if(f1 instanceof Circulo){
            System.out.println("Es un circulo");
       
}
    if(f1 instanceof Rectangulo){
        System.out.println("es un ractangulo");
    }else{
    
        System.out.println("no es un rectangulo");
    }
    }
    
}
