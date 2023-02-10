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
public class cuentaBancaria {
    //atributos de la clase tienen que ser privados
    private String NCuentaBancaria;
    private double Saldo;
    private String Cliente;
    //constructores
    //default y con argumentos
    public cuentaBancaria(){ //constructor default
        NCuentaBancaria = "0";
        Saldo = 0;
        Cliente = "";
        
    }
    public cuentaBancaria(String NCuenta, double otroSaldo,String NCliente){
        NCuentaBancaria = NCuenta;
        Saldo = otroSaldo;
        Cliente = NCliente;
        
        
                
              
        
    }
     //comportamiento
    //metodo get y set
    
    public String getNCuentaBancaria(){
        return NCuentaBancaria;
        
    }
    public double getSaldo(){
        return Saldo;
    }
    public String getCliente(){
        return Cliente;
        
    }
    public void  setNCuentaBancaria(String valor){
    NCuentaBancaria = valor;
    
}
    public void setSaldo( double valor){
        Saldo = valor;
    }
    public void setCliente (String valor){
        Cliente = valor;
    }
}


    
