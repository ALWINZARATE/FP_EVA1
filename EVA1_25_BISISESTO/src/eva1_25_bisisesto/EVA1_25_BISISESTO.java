/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_25_bisisesto;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_25_BISISESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int year ;
        System.out.println("Ingresa el año: ");
        year = captu.nextInt();
       if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " Si es año bisiesto.");
        } else {
            System.out.println(year + " no es año bisiesto.");
    }}
    
}
