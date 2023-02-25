/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_17_sobrecargaareas;

/**
 *
 * @author ivan2
 */
public class EVA1_17_sobrecargaAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        /*AREAS: 
        Circulo: pi*R*R 
        Triangulo: (B*H)/2
        Trapecio: (A+B)/2*H
        AREA()*/
        System.out.println("Area Circulo: " + circulo (5));
        System.out.println("Area Triangulo: " + triangulo (5,7));
        System.out.println("Area Trapecio: " + trapecio (5,8,7));
    }
    public static double circulo (double radio){
        return 2*Math. PI*radio; 
    }
    public static double triangulo(double altura, double base){
        return (base*altura)/2;
    }
     //A: area, B: base, H: altura
    public static double trapecio(double A, double B, double H ){
        return (A+B)/2.0*H;
    }
    
     
    
    
    
}
