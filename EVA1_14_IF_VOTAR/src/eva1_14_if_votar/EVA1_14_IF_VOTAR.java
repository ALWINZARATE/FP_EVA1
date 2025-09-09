/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_if_votar;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_14_IF_VOTAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int annio_nac;
        int edad;
        Scanner captu = new Scanner(System.in);
        System.out.println("Captura tu año de nacimiento: " );
        annio_nac = captu.nextInt(); 
        edad = 2025 - annio_nac;
        if(edad >= 18){
        System.out.println("SI PUEDES VOTAR!!");}else{ 
        System.out.println("NO PUEDES VOTAR!!");
        }
    }
    
}
