/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_23_compras;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_23_COMPRAS {
    final static String ACCESO = "si";
    /**
     */
    public static void main(String[] args) {
     String credito, efectivo;
     Scanner captu = new Scanner(System.in);
     System.out.println("CAJA DE TIENDA");
     System.out.println("LIVERPOOL");
     System.out.println("Cuenta con credito? si/no");
     credito = captu.nextLine();
     System.out.println("Y cuenta con efectivo? si/no");
     efectivo = captu.nextLine();
     if (credito.equalsIgnoreCase("si") || efectivo.equalsIgnoreCase("si")) {
       System.out.println("PERFECTO, SI PUEDE COMPRAR!!");
    }else{
       System.out.println("LO SIENTO, NO PUEDE COMPRAR!!");
    }
    
}}
