/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_11_return;

/**
 *
 * @author ivan2
 */
public class EVA1_11_RETURN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // TODO code application logic here
         int result;
        result= square(10);//invocacion o llamada a funcion
        System.out.println("resultado" + result);
        
         
    }
    
    public static int  square(int num){
       return  num * num;
         
    }
    
}
