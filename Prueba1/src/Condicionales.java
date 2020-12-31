
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Condicionales {
    
      public static void main(String[] args) {
          System.out.println("Escriba un programa que permita determinar el número mayor perteneciente a un conjunto de n números, donde tanto el valor de n como el de los números deben ser ingresados por el usuario.");
          //Vamos a leer lo que ingrese el usuario
          Scanner teclado = new Scanner(System.in);
          System.out.println("Ingrese numero");
          //Conjunto de numeros
          int numeroA = teclado.nextInt();
          int numeroB = teclado.nextInt();
          int numeroC = teclado.nextInt();
          int numeroD = teclado.nextInt();
          int numeroE = teclado.nextInt();
          //Variable donde vamos a guardar el mayor
          int mayor = 0;
          
          if(numeroA >numeroB){
              if(numeroA>numeroC){
                  if(numeroA>numeroD){
                    if(numeroA>numeroE){
                        mayor = numeroA;   
                    }else{
                      mayor = numeroE;
                    }   
                  }else{
                    mayor = numeroD;   
                  }
              }else{
                  mayor=numeroC;
              }
          }else{
             if(numeroB>numeroC){
                if(numeroB>numeroD){
                    if(numeroB>numeroE){
                        mayor =  numeroB;
                    }else{
                         mayor = numeroE;
                    }
                }else{
                    mayor = numeroD;
                } 
             }else{
                 mayor = numeroC;
             }
          }
          System.out.println("El mayor es :" + mayor);
      }
}
