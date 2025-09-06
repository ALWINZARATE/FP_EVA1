/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double califa;
        Scanner captu = new Scanner (System.in);
        
        System.out.println("introduce tu calificacion: " );
        califa = captu.nextDouble();
        //ESTRUCTURA DE CONTROL IF - THEN - ELISE
         if(califa >= 70){//SOLO EVALUA VERDADERO (TRUE) O FALSO (FALSE)
         //AQUI VA LO QUE CORRESPONDE A VERDADERO 
         System.out.println("FELICIDADES, ACREDITASTE!!");
         }else{ //SECCION FALSO(OPCIONAL)
        System.out.println("AZOTES!!");
                 }
    }
    
}
