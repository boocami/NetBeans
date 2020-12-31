/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import static java.lang.System.out;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class actividad1 {
    
    public static void main (String[] args){
        Scanner teclado = new Scanner(System.in);
         System.out.println("Problema 1: Una compañía de seguros contrata a n vendedores, cada uno de ellos tiene la misión de hacer tres ventas a la\n" +
"semana, por lo cual recibirán una comisión equivalente a un 10% del total de sus ventas.\n" +
"La empresa requiere saber el total de ventas de la semana de todos sus vendedores y cuál fue la mayor y\n" +
"menor de ellas.");
        Random random = new Random(); 
        //CANTIDAD DE VENDEDORES (ALEATORIO)(ES ALEATORIO PORQUE NO SE NOS ENTREGA ESA INFORMACION)
        int vendedores = (int)(Math.random()*10)+1;   
        int dias =  5;
        double [][] venta = new double [vendedores][dias];
        boolean condicionalVende;
        double totalVentas = 0;
        double menor = 100;
        double mayor = 1;
        int posicionMenor = 0;
        int posicionMayor = 0;
        int posicionDiaMenor = 0;
        int posicionDiaMayor  = 0;
        for (int i = 0; i<vendedores; i++){ //Recorrer los vendedores
            for (int j = 0; j<dias; j++){ //dias
                condicionalVende = random.nextBoolean();
                if(condicionalVende == true){
                    venta[i][j] = (double)(Math.random()*100)+1;
                }else{
                    venta[i][j] = 0;
                }
                totalVentas += venta[i][j];
            }
        }
        
        for (int i = 0; i<vendedores; i++){
            for (int j = 0; j<dias; j++){
                if(menor > venta[i][j]){
                    menor = venta[i][j];
                    posicionMenor = i;
                    posicionDiaMenor = j;
                }
             if(mayor < venta[i][j]){
                 mayor = venta[i][j];
                 posicionMayor = i;
                 posicionDiaMayor = j;
             }
            }
        }
        System.out.println("El total de la ventas de la semana fue: " + totalVentas);
        System.out.println("La menor venta fue de " + menor+ " y fue del vendedor " + posicionMenor + " en el dia " + posicionDiaMenor);
        System.out.println("La mayor venta fue de " + mayor+ " y fue del vendedor " + posicionMayor + " en el dia " + posicionDiaMayor );
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------------------");
        //
    }
    
    
}
