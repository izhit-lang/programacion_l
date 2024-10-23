import java.util.Scanner;

public class TallerE {
  public static void main(String[] args) {
    

          /* int I;
          double MAX, MIN, NUMERO;
          Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese un Numero: ");
          NUMERO = leer.nextDouble();
          MAX = NUMERO;
          MIN = NUMERO;
          for (I = 2; I <= 100; I++) {
          System.out.println("Ingrese el siguite Numero: ");
          NUMERO = leer.nextDouble();
          if (NUMERO > MAX) {
          MAX = NUMERO;
          } else if (NUMERO < MIN) {
          MIN = NUMERO;
          
          }
          
          System.out.println("Maximo: " + MAX + "Minimo: " + MIN);
          }
        */
 
     
        
    
          
      
         
          // * **************************************sig taller 5.16
         
        
          /*  int N1, N2;
          double M, Max;
          System.out.println("Ingrese los numeros (999 para terminar): ");
          Scanner leer = new Scanner(System.in);
          N1 = leer.nextInt();
         N2 = leer.nextInt();
          
          Max =(double) (N1 + N2) / 2;
          while (N2 != 999 && N1 != 999) {
            M = (double)(N1 + N2)/2;
          N1 = leer.nextInt();
          N2 = leer.nextInt();  
          if (M > Max){
          Max = M;
          }
           System.out.println("Ingrese los numeros (999 para terminar): ");
           N1 = leer.nextInt();
           N2 = leer.nextInt();
          }
          System.out.println("Media maxima = " + Max);*/
          
        
         

        // ****************************sig taller 5.17 */

        
          /* int SW = 0 ;
          double N;
          while ( SW == 0){
          System.out.println("Ingrese un numero: ");
          Scanner leer = new Scanner(System.in);
          
          N = leer.nextDouble();
          if (N % 1 != 0) {
          System.out.println("Dato no valido");
          System.out.println("Ejecute nuevamente");
          } else {
          System.out.println("correcto, " + N + " es entero");
          SW = 1;
         
          }
          }
        
         
        // *********************************sig taller 5.19*/
         
        Scanner leer = new Scanner(System.in);
        double media;
        System.out.println("Ingrese el nombre del alumno: ");
        String nombre = leer.next();
        while (!nombre.equals("**")) {
            System.out.println("Ingrese la nota en BASIC: ");
            double BASIC = leer.nextDouble();
            System.out.println("Ingrese la nota pascal: ");
            double pascal = leer.nextDouble();
            System.out.println("Ingrese la nota en FORTRAN: ");
            double FORTRAN = leer.nextDouble();
            media = (BASIC + pascal + FORTRAN) / 3;
            System.out.println("alumno: " + nombre + "/nSu media: " + media);
            System.out.println("Ingrese el nombre del alumno: ");
            nombre = leer.next();
        }

        /***********************************sig taller 5.9 */
      /*  Scanner leer = new Scanner(System.in);
          //code
          int A = 123;
          int B = 456;
          //price
          int PA = 2000;
          int PB = 300;
          //units
          int AE = 7;
          int BE = 8;

          System.out.println("Ingrese el codigo: ");
          int articulo = leer.nextInt();
          switch (articulo){

            case 123:
            System.out.println("codigo articulo: " + A);
            System.out.println("unidades existentes :" + AE);
            System.out.println("importe total:"+ PA * AE);
            break;
            case 456:
            System.out.println("codigo articulo: " + B);
            System.out.println("unidades existentes: "+ BE);
            System.out.println("importe total: " + PB * BE);
            break;
            default:
            System.out.println("ingrese un articulo valido ");
            break;

        }
    

        /**********************************sigt taller 5.10 */
        /*Scanner leer = new Scanner(System.in);
        int totalDias = 0;
        int diasValidos = 0;
        double sumaMaxima = 0;
        double sumaMinima = 0;
        int errores = 0;
        while (true) {
          System.out.println("Ingrese la temperatura maxima y minima del dia, o 00 para finalizar: ");
          int max = leer.nextInt();
          int min = leer.nextInt();
          if (max == 0 && min == 0) {
            break;
          }
          totalDias++;
          if (max == 9 || min == 9) {
            errores++;
          } else {
            diasValidos++;
            sumaMaxima += max;
            sumaMinima += min;
          }
        }
        if (diasValidos > 0) {
          double mediaMaxima = sumaMaxima / diasValidos;
          double mediaMinima = sumaMinima / diasValidos;
          double porcentajesErrores = ((double) errores / totalDias) * 100;
          System.out.println("numero de dias proporcionados" + totalDias);
          System.out.println("media de temperaturas maximas" + mediaMaxima);
          System.out.println("media de temperatura minimas" + mediaMinima);
          System.out.println("numero de errores (temperaturas de 9)"+ errores);
          System.out.println("Porcentaje de errores: " +  porcentajesErrores + "%"); 

        }else{
          System.out.println(" no proporcionaron dias con temperaturas validas:  ");
        }*/
      
  }
}