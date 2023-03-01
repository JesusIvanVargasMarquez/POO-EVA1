/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import Paquete2.claseE;

/**
 *
 * @author ivan2
 */
public class claseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        claseA objA = new claseA();
        //objA.publicA; atributos visibles
        //objA.defaultA;
        
        claseB objB = new claseB();
        //objB.publicB; atributos visibles
        //objB.defaultB;
        
        claseD objD = new claseD();
        //objD.publicD; atributos visibles
        //objD.defaultD;
        
        //Clase E esta en otro paquete y archivo
        //hay que agregar la clausula "import"
        claseE objE = new claseE();
        //objE.publicE; solo el atributo publico