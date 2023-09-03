/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

import java.util.Scanner;

/**
 *
 * @author yaneth
 */
public class ejercicio1 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int numDia= 8; //valor que ingrese el usuario mediante teclado.
        
        System.out.println("Ingrese un número de la semana (1-7) :");
        numDia=scanner.nextInt();
        
        
         switch(numDia){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Invalido");
        
        }
        
        
        
    }
    
}
    

