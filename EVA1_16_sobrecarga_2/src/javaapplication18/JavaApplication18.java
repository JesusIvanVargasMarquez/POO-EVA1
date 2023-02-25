/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

/**
 *
 * @author ivan2
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("suma: " + suma(4,5));
        System.out.println("suma: " + suma(4.5,3.5));
        System.out.println("suma: " + suma("hola" , "mundo"));
        suma();
         
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    //suma (double,double)
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    //suma (String,String)
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    //suma sin argumentos
    public static void suma(){
     System.out.println("metodo de parametros de suma");
           
        
    }
     
}
