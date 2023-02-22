/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_8_llamada_funcion;

/**
 *
 * @author ivan2
 */
public class EVA1_8_LLAMADA_FUNCION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("inicia main()");
        A();//llamada a funcion
        System.out.println("termina main()");
        
    }
    public static void A(){
         System.out.println("inicia A()");
         B();
         System.out.println("termina main()");
    }
     public static void B(){
         System.out.println("inicia B()");
         
         System.out.println("termina main()");
     }


}
