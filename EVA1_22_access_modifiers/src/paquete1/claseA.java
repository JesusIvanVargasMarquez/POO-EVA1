/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import paquete2.claseE;

/**
 *
 * @author ivan2
 */
public class claseA {
    public int publicA;
    int defaultA;
    private int privateA;
    
    public void prueba(){
        claseB objB = new claseB();
        //objB.publicB; atributos visibles
        //objB.defaultB;
        
        claseC objC = new claseC();
        //objC.publicC; atributos visibles
        //objC.defaultC;
        
        //Clase D es default en otro archivo
        //pero mismo paquete
        claseD objD = new claseD();
        //objD.publicD; atributos visibles
        //objD.defaultD;
        
        //Clase E esta en otro paquete y archivo
        //hay que agregar la clausula "import"
        claseE objE = new claseE();
        //objE.publicE; solo el atributo publico
        
        //ClaseF es default y es invisible
        //para las clases de este Paquete1
        //ClaseF objF = new ClaseF();
    }
}

class claseB{
    public int publicB;
    int defaultB;
    private int privateB;
    
}
