
import java.util.Scanner;
 
public class Ejecutar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el nombre del jugador 1");
        String nombre1 = scanner.nextLine();
   
        System.out.println("Introduce el nombre del jugador 2:");
        String nombre2 = scanner.nextLine();
        JuegoLucha juego = new JuegoLucha(nombre1, nombre2);
        juego.iniciarPelea();
        scanner.close();
    }
}
 
    

