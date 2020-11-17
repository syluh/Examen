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
public class Libreria {
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         
         //Declarar variables
         String tipo;
          
         double costl, cantl, total, tipo1, tipo2, tipo3; 
         
         cantl=0; costl=0; total=0; tipo1=0; tipo2=0; tipo3=0;
         tipo ="Docente";
         
         System.out.println("Programa que permite calcular el valor de la compra de libros aplicando descuentos");
         System.out.println("---------------------");
         
         System.out.println("Ingrese la cantidad de libros a comprar");
         cantl = leer.nextInt();
         
         System.out.println("Ingrese que tipo de cliente es");
         tipo = leer.next();
         
         //Proceso
         //Condiciones para aplicar el descuento correspondiente
             if ((cantl>5)&&(cantl<10))
                 costl = cantl-(cantl*0.04);
             if (cantl>10)
                 costl = cantl-(cantl*0.08);
             
             
         
             System.out.println("El valor a pagar es " +costl);                 
              
             tipo1 = costl-(cantl*0.3);
             tipo2 = costl-(cantl*0.2);
             tipo3 = costl;
             
             System.out.println("Pero si es Docente solo debe de pagar " +tipo1);
             System.out.println("Pero si es Estudiante solo debe de pagar " +tipo2);
             System.out.println("Si no es ninguno de los 2 tendra que papgar " +tipo3);
         
    }

   
}
