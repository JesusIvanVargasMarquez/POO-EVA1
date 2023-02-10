/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva_1_2_clases_java;

/**
 *
 * @author ivan2
 */
public class Persona {
    //atributos de la clase
   private String nombre;
   private String apellido;
   private int edad;
   private boolean estadoCivil;
    //metodo:comportamiento
    //lectura y escritura de atributos:
    //metodos get-->leer,metodo set-->escribir
    //modificador valor de retorno nombre(argumentos)(implementacion)
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String valor){
       nombre = valor;
       
   }
   public String getApellido(){
       return apellido;
   }
   public void setApellido(String valor){
       nombre = valor;
       
   }
   public int getEdad(){
       return edad;
   }
   public void setEdad(int valor){
       edad=valor;
   }
   public boolean getEstadoCivil(){
       return estadoCivil;
   }
   public void setEstadoCivil(boolean valor){
       estadoCivil=valor;
   }
  public void imprimirDatos(){
        System.out.println("Datos almacenados:");
                           //concatenación
                           //+ suma (números) + concatena <-- sobrecarga de operadores
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " anos");
        if(estadoCivil)
            System.out.println("Estado civil: casado");
        else
            System.out.println("Estado civil: soltero");
    }
       
       
       
   }


