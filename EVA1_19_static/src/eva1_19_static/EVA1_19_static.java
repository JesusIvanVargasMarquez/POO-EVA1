/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_19_static;

/**
 *
 * @author ivan2
 */
public class EVA1_19_static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PI" + Math.PI);
        System.out.println("numero aleatorio:" + Math.random());
        Utilerias utileria = new Utilerias();
        utileria.saludo();
        Utilerias.otroSaludo();
        Saludo2();//si no es estatico, y no se ha creado
                  //un objeto,el metodo no existe
    }
    public void Saludo2(){
        System.out.println("Hola");
    }
    
}
 class Utilerias{
     //este metodo existe hasta que se crea un objeto de la clase
     //clase. solo se usa a travez de un objeto
   public void saludo(){
       System.out.println("hola");
       
   }
   //ESTE METODO EXISTE EN EL MOMENTO QUE EL PROGRAMA INICIA
   //INICIA SU EJECUCION.NO NECESITA QUE SE CREE UN OBJETO DE LA CLASE
   
   public static void otroSaludo(){
     System.out.println("jelou(Static)");  
   }
     
 }
class otraclase{

}