/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;
public class Ejercicio6 {
    
    public static void main(String[] args){
        
        Scanner teclado=new Scanner(System.in);
        
        double iva;
        double base;
        double resultado;
        
        System.out.print("Cual es la base? ");
            base=teclado.nextInt();
        System.out.print("Cuanto es el IVA? ");
            iva=teclado.nextInt();
        
            resultado=base*iva/100+base;
        System.out.println("El valor total de la factura es "+resultado);
    }
    
}
