/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

/**
 *
 * @author HP
 */
public class actividad2 {
     public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cree un arreglo de “n” posiciones con números aleatorios entre 10 y 70 y contabilice la cantidad de pares,\n" +
"impares, divisibles por 3 y por 5. Debe entregar un reporte con los resultados");
        //N POSICIONES
        int m = (int)(Math.random()*10)+1;
        int numero = 0;
        int cantidadPares = 0;
        int cantidadInpares = 0;
        int cantdivisibles = 0;
        int par[] = new int [100];
        int  impares[] = new int [100];
        int divisibles[] = new int [100];
        int array [] = new int [m];
        //Llenando el array
        for (int i = 0; i<array.length; i++){
            numero = (int)(Math.random()*71)+10;
            System.out.println("Numero: " + numero);
            array[i] = numero;
            if(numero % 2 == 0){
                par[cantidadPares] = array[i];//numero
                cantidadPares++;
            }else{
                impares[cantidadInpares] = array[i];
                cantidadInpares++;
            }
            if (numero %3 == 0 && numero % 5 == 0){
                divisibles[cantdivisibles] = array[i];
                cantdivisibles ++;
            }
        }
        System.out.println("Reporte de Pares: ");
        if(cantidadPares>0){
            for (int i = 0; i<cantidadPares; i++){
                System.out.println(par[i]);
            }
        }else{
            System.out.println("No existen pares dentro del array ");
        }
        
        System.out.println("Reporte de Impares: ");
        if(cantidadInpares>0){
            for (int i = 0; i<cantidadInpares; i++){
               System.out.println(impares[i]);
            }
        }else{
            System.out.println("No existen impares dentro del array ");
        }
        System.out.println("Reporte de Divisibles: ");
        if(cantdivisibles<0){
            for (int i = 0; i<cantdivisibles; i++){
                System.out.println(divisibles[i]);
            }   
        }else{
            System.out.println("No existen divisibles entre 3 y 5 dentro del array ");
        }
    }    
}
