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
public class EVA_1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //clase es la receta
        //objeto es el platillo
        //instaciacion
        //1.declarar la identificador para el objeto
        //2.Asignar memoria con new
        //3.invocar su constructor
        //constructor-->metodo
        Persona perso1 = new Persona ();
        //System.out.println(perso1);
        /*:
        //ESTA SECCIÓN ES PORQUE INICIAMOS CON LOS
        //ATRIBUTOS CON MODIFICADOR DEFAULT
        perso1.nombre = "ivan";
        perso1.apellido = "vargas";
        perso1.edad = 18;
        perso1.estadoCivil = true; // true es igual a casado
        System.out.println(perso1.nombre);*/
       perso1.setNombre("ivan");
       System.out.println(perso1.getNombre());
       
       perso1.setApellido("vargas");
       System.out.println(perso1.getApellido());
       perso1.setEdad(18);
       System.out.println(perso1.getEdad());
       perso1.setEstadoCivil(false);
       System.out.println(perso1.getEstadoCivil());
      perso1.imprimirDatos();
      
      Persona perso2;
        perso2 = new Persona ();
        perso2.setNombre("Axel Jesus");
        perso2.setApellido("hernandez calderon");
        perso2.setEdad(18);
        perso2.setEstadoCivil (false);
        perso2.imprimirDatos();
      
               
               
    }
    
}
