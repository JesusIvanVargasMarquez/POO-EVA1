/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_tv;

/**
 *
 * @author ivan2
 */
public class Tv {
private int volumen;
private int canal;
private boolean poder;   
//constructores
public Tv(){
    volumen =0;
    canal = 0;
    poder = false; //apagado
}
//metodos para operar la tv (interfaz)
//encender y apgar la tv
public void cambiarEstadoPoder(){
    //VERIFICAR EL ESTADO DE LA TV
    if(poder== true){
        poder = false;
        System.out.println("apagando pantalla");
        
    }else{
        poder = true;
            System.out.println("encendiendo pantalla");
                    

}
}
//volumen
public void subirVolumen(){
    if(poder == true){
    //no debemos de pasarnos de 100//
        if(volumen < 100){
            volumen =volumen  +=1;
            System.out.println("volumen: " + volumen);
        }
    }
}
public void bajarVolumen(){
    if(poder==true){
        if (volumen > 0){
            volumen = volumen -=1;
            System.out.println("volumen: "+ volumen);
            }
        }
    }

 public void bajarCanal(){
        if (poder == true){
            canal = canal -1;
            if(canal < 0)
                canal = 100;
                
                System.out.println("canal: " + canal);
            }
        }
     public void subirCanal(){
        if (poder == true){
            canal = canal + 1;
                if(canal > 100)
                    canal = 0;
                    System.out.println("canal: " + canal);   
        }
    }
} 



