/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_3_constructores;

/**
 *
 * @author ivan2
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cuentaBancaria cuenta1 = new cuentaBancaria("2", 400000000,"carlos slim");
      //  cuenta1.setCliente("carlos slim");
       // cuenta1.setNCuentaBancaria("1");
        //cuenta1.setSaldo(40000000);
       // System.out.println("DATOS DEL CLIENTE");
     
       String nombre = cuenta1.getCliente();
       System.out.println(nombre);
        System.out.println(cuenta1.getNCuentaBancaria());
        System.out.println(cuenta1.getSaldo());
        
        cuentaBancaria cuenta2 = new cuentaBancaria("3",10,"Tom Brady");
        System.out.println("DATOS DEL CLIENTE");
       System.out.println(nombre);
        System.out.println(cuenta2.getNCuentaBancaria());
        System.out.println(cuenta2.getSaldo());
        
        
        
        
        
        
  
                
        
    }
    
}
