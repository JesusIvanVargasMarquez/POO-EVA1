/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_califas;

/**
 *
 * @author ivan2
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        String calificaciones;
        calificaciones =  calificaciones (90);
        System.out.println("calificaciones para 80:" + calificaciones);
        System.out.println("calificaciones para 40" + calificaciones);
       
       
}
    public static String calificaciones (int calificaciones){
       if ((calificaciones >= 91 ) && (calificaciones <= 100)){
        return "A";
            } else if ((calificaciones >= 81) && (calificaciones <= 90)){
            return"B";
            
         } else if ((calificaciones >= 71) && (calificaciones <= 80)){
             return "C";
         }else{
             return "D";
         }
         
        
    
    
    } 

}
