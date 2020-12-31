/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner myObj = new Scanner(System.in); 
//        System.out.println("Ingrese Ph");
//        int ph = myObj.nextInt();
//       //<7 es acida
//       //=0 neutra
//       //> 7 basica
//       if(ph >= 7){
//        System.out.println("PH Basica");
//       }else if(ph == 0){
//             System.out.println("PH neutra");
//       }else if(ph < 7 ){
//            System.out.println("PH Acida");
//       }
        double kilometrosTotal = 42.195;
        System.out.println("Ingrese Kilometro");
        double kilometro = myObj.nextDouble();
        int hora = 0;
        int aux  = 0;
        while(aux <25){
         System.out.println("Ingrese la hora");
         hora =  myObj.nextInt();
         System.out.println(hora);
         if(hora < 25 ){
             aux = 25;
         }
        }
        System.out.println("Ingrese minutos"); 
        int aux2 = 0;
        int minutos = 0;
        while(aux2 <59 ){
        System.out.println("Ingrese minutos");
         minutos =  myObj.nextInt();
         if(minutos < 59 ){
             aux2 = 59;
         }
        }
        double distanciaRestante = kilometrosTotal - kilometro;
        double velocidad = kilometro/hora; //Velocidad actual
        int tiempo = (int) (kilometrosTotal / velocidad); // tiempo que me demoro en base a la velocidad actual
        System.out.println(distanciaRestante);
         System.out.println(velocidad);
         System.out.println(tiempo);
        if(hora > 4 && minutos > 0 && kilometro < kilometrosTotal){
           System.out.print("Ya pasaron 4 horas. Lo siento.");
        }else if(tiempo == 4){
             System.out.print("Faltan" + distanciaRestante + "kilometros para terminar. Corriendo asi llegaras en" + (tiempo-hora) +"horas");
        }else if(tiempo < 4 && distanciaRestante > 0 ){
              double velocidaEsperada = distanciaRestante/hora-2;
              int tiempoEsperado = (int) (distanciaRestante / velocidaEsperada);
            System.out.println("Faltan K kilometros para terminar. Debes ir mas rapido y subir tu velocidad a"+ velocidaEsperada + "V km/h para llegar en 4 horas o menos");
        }else if(hora > 4){
              System.out.print("Ya pasaron 4 horas. Lo siento.");
        }

        //velocidad = distancia/tiempo
        //velocidad * tiempo = distancia
        //distancia * velocidad = tiempo
        //v(10,54875) = 22/ 3 --- > Velocidad ideal
        //
        
   
    }
    
}
