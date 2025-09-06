/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_captura;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_11_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //CALCULO DE VELOCIDAD:
     //SOLICITAR DISTANCIA (M) Y TIEMPO (S)
     //CALCULA LA VELOCIDAD (M/S)
     //DECLARAR VARIABLE Y SCANER
     Scanner input = new Scanner(System.in);
     double distancia, velocidad, tiempo,VelocidadK;
     
     //SOLICITAR DATOS
     System.out.println("Captura la disrancia(en metros):");
     distancia = input.nextDouble();
     System.out.println("Captura el tiempo(en segundos:");
     tiempo = input.nextDouble();
    //REALIZAR CALCULOS
     velocidad = distancia / tiempo;
     //MOSTRAR RESULTADO
     System.out.println("La velocidad en (m/s) es:");
     System.out.println(velocidad);
     //dar resultados en Km/hr
     VelocidadK = velocidad * 3.6;
     System.out.println ("Dar resultados en Km/hr:");
     System.out.println(VelocidadK);
    }
    
}
