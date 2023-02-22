/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_6_automovil;

/**
 *
 * @author ivan2
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        automovil car1 = new automovil("FORD","redbull 18",2010,"ivan vargas","813-9U2");
        car1.imprimirDatos();
        car1.setAño(2010);
        car1.imprimirDatos();
       
        
    }
    
}
