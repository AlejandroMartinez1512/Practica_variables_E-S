/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.politecnicomalaga;
import java.util.Scanner;
public class Ejercicio2 {
     
    public static void main(String[] args){
        
        Scanner numero=new Scanner(System.in);
        
        System.out.println("Introduce el primer valor:");
        int x = numero.nextInt();
        System.out.println("Introduce el segundo valor:");
        int y = numero.nextInt();
        
        System.out.println("Valores");
        System.out.println(x+", "+y);
        System.out.println("Suma");
        System.out.println(x+y);
        System.out.println("Resta");
        System.out.println(x-y);
        System.out.println("Multiplicacion");
        System.out.println(x*y);
        System.out.println("Division");
        System.out.println(((double)x)/((double)y));
        
    }
    
    
}
