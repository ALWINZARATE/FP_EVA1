/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_24_califas;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_24_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int califa;
        System.out.println("ingresa tu calificacion: ");
        califa = captu.nextInt();
        if (califa >= 90 && califa <=100){
        System.out.println("Sacaste una A");
        } else if (califa >= 80 && califa <=89){
        System.out.println("Sacaste una B");
        } else if (califa >= 70 && califa <=79){
        System.out.println("Sacaste una C");
        } else if (califa >= 60 && califa <=69){
        System.out.println("Sacaste una D");
        } else if (califa >= 0 && califa <=59){
        System.out.println("Sacaste una F");
        }}
    }
    

