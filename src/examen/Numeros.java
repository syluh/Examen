/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.util.Scanner;
/**
 *
 * @author VICTOR
 */
public class Numeros {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        
        //Declarar variables
        
        double  m4, m5, m6, total;
        int n;
        n = 0; m4 = 0; m5 = 0; m6 = 0; total = 0;
        
        System.out.println("Programa que calcula los multiplos y realiza operaciones");
        System.out.println("--------");
        
        System.out.println("Ingrese el número a comparar");
        n  = leer.nextInt();
        
        //Proceso
        //Condiciones
        
         if (n % 4 == 0) {
            total = n / 2;
        
            System.out.println("El resultado es " +total);
        } else if (n % 5 == 0) {
            
           total = n*n;
            
            System.out.println("El resultado es" +total);
        } else if (n % 6 == 0) {
            total = n;
           System.out.println("El resultado es " +total);
        }
        
     
    
                    
        
                
        
    }
    
}
