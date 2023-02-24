/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_14_alcance.pkg2;

/**
 *
 * @author ivan2
 */
public class EVA1_14_alcance2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int x = 100;// visible dentro del todo bloque main();
        for (int i = 0; i < 10; i++) {
            int x = 100; //la variable esta declarada en main() y es visible dentro del for
            int y =100; // visible dentro del for
            if(i == 5){
                
                
            }
            
        }
        int y = 100; // aqqui la variable y del ciclo for no existe
                     // podemos declarar una variable del mismo nombre
        
    }
    
}
