/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_antro;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_20_ANTRO {
    final static String ACCESO_CRE = "si";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int edad;
        String credencial;
        System.out.println("******CONTROL DE ACCESO******");
        System.out.println("ANTRO");
        System.out.println("edad: ");
        edad = Integer.parseInt(captu.nextLine());
         System.out.println("Cuenta con credencial? si/no");
         credencial = captu.nextLine();
    if(edad >=18){
        if(credencial.equals(ACCESO_CRE)){
            System.out.println("Adelante, puede pasar");
        }else{
            System.out.println("No puede pasar: Requiere credencial");
        }
    }else{
        System.out.println("INCORRECTO");
    }
    
        
    }
    
}
