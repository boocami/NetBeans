
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
public class Divicion {
    
    public static void main(String[] args) {
        System.out.println("Escriba un programa que pida dos números enteros y que calcule su división, escribiendo si la división es exacta o no. Tenga en cuenta que no se puede dividir por cero:");
        Scanner scanner = new Scanner (System.in);
        double numeroA =  scanner.nextInt();
        double numeroB = scanner.nextInt();
        float divicion = 0;
        float resto = 0;
        //while (numeroB == 0){
            //System.out.println("Ingrese el segundo numero");
            //numeroB = scanner.nextInt();
        //}
        if(numeroB == 0){
            System.out.println("No se puede dividir en 0");
        }else{
            divicion =  (float) (numeroA/numeroB);
            resto = (float) (numeroA%numeroB);
            //int x = (int)divicion;
        }
        System.out.println("El resultado de la divicion es: " + divicion);
        System.out.println("El resto es: " + resto);
        
        
        
    }
}
