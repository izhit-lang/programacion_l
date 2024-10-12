import java.util.Scanner;

public class TallerE {
    public static void main(String[] args) {
        // int I;
        // double MAX, MIN, NUMERO;
        // Scanner leer = new Scanner(System.in);
        // System.out.println("Ingrese un Numero: ");
        // NUMERO = leer.nextDouble();
        // MAX = NUMERO;
        // MIN = NUMERO;
        // for (I = 2; I <= 100; I++) {
        // System.out.println("Ingrese el siguite Numero: ");
        // NUMERO = leer.nextDouble();
        // if (NUMERO > MAX) {
        // } else if (NUMERO < MIN) {
        // MIN = NUMERO;

        // }

        // System.out.println("Maximo: " + MAX + ", Minimo: " + MIN);

        // * **************************************sig taller */
        // int N1, N2;
        // double M, Max;

        // Scanner leer = new Scanner(System.in);
        // N1= leer.nextInt();
        // N2= leer.nextInt();

        // Max=(N1+N2)/2.0;
        // while(N2 != 999 && N1 != 999){
        // N1 = leer.nextInt();
        // N2 = leer.nextInt();
        // M = (N1 + N2) / 2.0;
        // if (M > Max) {
        // Max = M;
        // }
        // }
        // System.out.println("Media maxima = "+ Max);

        // ****************************sig taller */

        int SW = 0 ;
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


        //*********************************sig taller */
        

    }
}
