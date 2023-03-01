/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.claseA;
import paquete1.claseB;
import paquete1.claseC;
import paquete1.claseD;

/**
 *
 * @author ivan2
 */
public class claseE {
    public class claseE {
    public int publicE;
    int defaultE;
    private int privateE;
    
    public void prueba(){
        claseA objA = new claseA();
        //objA.publicA;
        
        //ClaseB es invisible por ser clase default
        //y esta en otro paquete
        //ClaseB objB = new ClaseB();
        
        claseC objC = new claseC();
        //objC.publicC;
        
        //ClaseD es invisible por ser clase default
        //y esta en otro paquete
        //ClaseD objD = new ClaseD();
        
        claseF objF = new claseF();
        //objF.publicF; atributos visibles
        //objF.defaultF;
    }
}

class claseF{
    public int publicF;
    int defaultF;
    private int privateF;
    
}