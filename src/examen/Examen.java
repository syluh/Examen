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
public class Examen {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        //Declarar variables
        double n;
        String c1;
    ;
        
        
        n=0;
        c1 = "Exelente"; 
              
        
        
        System.out.println("Programa que permite trasnformar las calificaciones a lenjuaje natural");
        System.out.println("--------");
        
        System.out.println("Ingrese la calificacion a trasformar");
            
        n = leer.nextDouble();
        
        //Proceso
        //Condiciones que cualifican la nota del alumno
            if (n>=3.0) //La nota es válida como aprobasa
                if ((n>=4.6)&&(n<=5.0)) 
                    c1 = "El alumno es Exelente";
                if ((n >=4.1)&&(n <=4.5))
                    c1 = "El almuno es mu bueno";
                if ((n>=3.6)&&(n<=4.0))
                    c1 = "El estudiante es bueno";
                if ((n>=3.3)&&(n<=3.5))
                    c1 = "El alumno registró un desempeño aceptable";
                if ((n>=3.0)&&(n<=3.2))
                    c1 = "El alumno aprobo";
                if ((n>=2.6)&&(n<=2.9))
                    c1 = "El alumno es fediciente ";
                if ((n>=2.1)&&(n<=2.5))
                    c1 = "El alumno es malo";
                if ((n>=0.0)&&(n<=2.0))
                    c1 = "El alumno debe mejorar y considerablemente";
         //Salida
         System.out.println("Ya que la nota del alumno es " +n +", " +c1);
        
       
  }
    
}
