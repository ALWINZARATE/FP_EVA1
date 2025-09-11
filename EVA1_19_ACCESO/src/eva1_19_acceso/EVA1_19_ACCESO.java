/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_19_acceso;

import java.util.Scanner;

/**
 *
 * @author zarat
 */
public class EVA1_19_ACCESO {
    //CONSTANTE
    final static String ACCESO_USU = "ALWIN";
    final static String ACCESO_CONTRA = "1234";
    //final static double PI = 3.1416;
    
    public static void main(String[] args) {
     String usuario, contra;
     Scanner captu = new Scanner(System.in);
     System.out.println("*******CONTROL DE ACCESO******");
     System.out.println("Restaurante La Cucaracha Crocante");
     System.out.println("Usuario: ");
     usuario = captu.nextLine();
     System.out.println("Contraseña: ");
     contra = captu.nextLine();
     if(usuario.equals(ACCESO_USU)){
        if(contra.equals(ACCESO_CONTRA )){
            System.out.println("ACCESO CONCEDIDO!!");
     }else{
            System.out.println("ACCESO DENEGADO!!");
        }
     }else{
         System.out.println("INCORRECTO");
     }
    }}
    

