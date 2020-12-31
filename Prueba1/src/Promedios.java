
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
public class Promedios {
    
    public static void main(String[] args) {
        System.out.println("Obtener promedio de notas de un alumno(5 notas) e indicar si pasa el ramo o lo repite, para repertir el ramo la nota debe ser menor a 4");
        Scanner teclado = new Scanner(System.in);
        double primeraNota = 0;
        double segundaNota = 0;
        double terceraNota = 0;
        double cuartaNota = 0;
        double quintaNota = 0;
        double promedio = 0;
        while(primeraNota < 1.1){
            System.out.println("Ingrese la primera nota");
            primeraNota = teclado.nextDouble();
        }
        while(segundaNota <1.1){
            System.out.println("Ingrese la segunda nota");
           segundaNota = teclado.nextDouble();
        }
        while(terceraNota <1.1){
            System.out.println("Ingrese la tercera nota");
           terceraNota = teclado.nextDouble();
        }
        while(cuartaNota <1.1){
            System.out.println("Ingrese la cuarta nota");
           cuartaNota = teclado.nextDouble();
        }
        while(quintaNota <1.1){
            System.out.println("Ingrese la quinta nota");
           quintaNota = teclado.nextDouble();
        }
        promedio =  (primeraNota + segundaNota + terceraNota + cuartaNota + quintaNota)/5;
        System.out.println("El promedio del almuno es :" + promedio);
        if(promedio >4.0){
            System.out.println("El alumno pasa el ramo");
        }else{
            System.out.println("El alumno repite el ramo");
        }
    }   
}
