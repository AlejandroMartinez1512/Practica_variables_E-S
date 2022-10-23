/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;

public class Ejercicio5 {
        
    public static void main(String[] args){
        
        Scanner teclado=new Scanner(System.in);
        
        System.out.print("Cual es tu nombre? ");
        String nombre = teclado.next();
        
        System.out.print("Donde vives? ");
        String direccion = teclado.next();
        
        System.out.print("Cual es tu numero? ");
        int telefono = teclado.nextInt();
        
        System.out.println("Mi nombre es "+nombre);
        System.out.println("Vivo en "+direccion);
        System.out.println("Mi telefono es "+telefono);
        
    }
    
}
