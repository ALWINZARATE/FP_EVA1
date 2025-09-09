/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_numero_mayor;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_16_NUMERO_MAYOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        double numero, numero2;
        System.out.println("Captura el primer numero");
        numero = captu.nextInt();
        System.out.println("Captura el segundo numero");
        numero2 = captu.nextInt();
        if(numero > numero2){
        System.out.println("El primer numero es mayor que el segundo");
        }else{
        System.out.println("El segundo numero es mayor que el primero");}
         }
    }
    

