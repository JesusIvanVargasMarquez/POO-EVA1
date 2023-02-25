/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_18_sobrecarga_de._rfc;

/**
 *
 * @author ivan2
 */
public class EVA1_18_sobrecarga_de_rfc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String RFC = generarRFC("JESUS IVAN", "VARGAS", "MARQUEZ", 04, 8, 1);
       System.out.println(RFC);
    }
     public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
        String nom = nombre.charAt(0) + "";
        String apP1 = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1)+ "";
        String apM = apMat.charAt(0) + "";
        String RFC = apP1 + apP2 + apM + nom + año + mes + dia;
        return RFC;
    }
    
    //Faltan dos apellidos -->Sustituir por XX
    
    }
    //SOBRECARGA PARA LOS CASO
    //FALTE UN APELLIDO --> SUTITUIR POR UNA X
    //FALTAN DOS APELLIDOS --> SUSTITUIR POR XX
            
    

