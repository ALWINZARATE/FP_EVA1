/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_9_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;
        int edad;
        double promedio;
        Scanner captu = new Scanner (System.in);//CREAMOS EL SCANER
        
        
        //COMO CAPTURAR EN JAVA
        System.out.println("Introduce el nombre completo: ");
        nombre = captu.nextLine();//netxline() --captura textO
       System.out.println("Introduce tu edad:");
       edad = captu.nextInt();      
       System.out.println("Captura el promedio:");
       promedio = captu.nextDouble();      
       System.out.println("El nombre es:");
       System.out.println(nombre);
       System.out.println("La edad es:");
       System.out.println(edad);
       System.out.println("El promedio es:");
       System.out.println(promedio);
    }
    
}
