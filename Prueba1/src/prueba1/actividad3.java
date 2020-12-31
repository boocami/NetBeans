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
  
public class actividad3 {
     public static void main(String[] args) {
                 System.out.println("Contabilizar cuantas personas de cada grupo se crean y que porcentaje representan del total (debe usar\n" +
"switch/case)");
         int n = 0;
         int numero = 0;
        /*while(n == 0){
            n = (int) (Math.random()*10); 
        }*/
        n = (int) (Math.random()*10)+1;
        System.out.println("Cantidad de numeros " + n);
        
        int contMujerSoltera = 0;
        int contHombreSoltero = 0;
        int contMujerCasada = 0;
        int contHombreCasado = 0;
        int contMujerViuda = 0;
        int contHombreViudo = 0;
        int contMujerDivorciada = 0;
        int contHombreDivorciado = 0;
        double porcentajeMujerSoltera = 0;
        double porcentajeHombreSoltero = 0;
        double porcentajeMujerCasada = 0;
        double porcentajeHombreCasado = 0;
        double porcentajeHombreViudo = 0;
        double porcentajeMujerViuda = 0;
        double porcentajeMujerDivorciada = 0;
        double porcentajeHombreDivorciado = 0;

        for (int i = 0; i<n; i++){
             numero = (int)(Math.random() * 8) + 1;   
         System.out.println("El numeros " + numero);
            switch(numero){
                case 1: 
                    contMujerSoltera++;
                    break;
                case 2: 
                    contHombreSoltero++;
                    break;
                case 3:
                    contMujerCasada++;
                    break;
                case 4: 
                  contHombreCasado++;
                  break;
                case 5:
                    contMujerViuda++;
                    break;
                case 6:
                    contHombreViudo++;
                    break;
                case 7:
                    contMujerDivorciada++;
                    break;
                case 8:
                    contHombreDivorciado++;
                    break;
            }
        }
        porcentajeMujerSoltera = (contMujerSoltera * 100)/n;
        porcentajeHombreSoltero = (contHombreSoltero * 100)/n; 
        System.out.println("Reporte de mujer soltera: " + contMujerSoltera);
        System.out.println("Reporte de hombre soltero: " + contHombreSoltero);
        System.out.println("Reporte de mujer casada: " + contMujerCasada);
        System.out.println("Reporte de hombre casado: " + contHombreCasado);
        System.out.println("Reporte de mujer viuda : " + contMujerViuda);
        System.out.println("Reporte de hombre viudo : " + contHombreViudo);
        System.out.println("Reporte de mujer divorciada : " + contMujerDivorciada);
        System.out.println("Reporte de hombre divorciado : " + contHombreDivorciado);
    }
}
