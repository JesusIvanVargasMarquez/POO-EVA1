/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_20_static_2;

/**
 *
 * @author ivan2
 */
public class EVA1_20_static_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* final int x;
        x = 100;
        x = 200; */
        FormulasGeometria formulas = new FormulasGeometria();
        //formulas. no existe ningún método dentro del objeto
        System.out.println("MI PI: " + FormulasGeometria.PI);
        System.out.println("Area triangulo: " + FormulasGeometria.areaTriangulo(5.0, 5.0));
        System.out.println("Volumen esfera: " + FormulasGeometria.volumenEsfera(10));
    }
    
}
