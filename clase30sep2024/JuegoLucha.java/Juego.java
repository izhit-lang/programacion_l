import java.util.Random;
import java.util.Scanner;

class Personaje {
    private String nombre;
    private int puntosDeVida;
    private final int MAX_DANO = 30;
    private final int MIN_DANO = 10;

    // construtor para inicializar los datos del personaje
    public Personaje(String nombre) {
        this.nombre = nombre;
        this.puntosDeVida = 100; // Todos comienzan con 100 puntos de vida
    }

    // Metodo para realizar un ataque a otro personaje
    public void atacar(Personaje oponente) {
        Random rand = new Random();
        int dano = rand.nextInt((MAX_DANO - MIN_DANO) + 1) + MIN_DANO; // dano entre 10 y 30
        oponente.recibirDano(dano);
        System.out.println(this.nombre + " ataca a " + dano + "puntos de dano.");

    }

    // metodo para recibir dano
    public void recibirDano(int dano) {
        this.puntosDeVida -= dano;
        if (this.puntosDeVida < 0) {
            this.puntosDeVida = 0; // No se puede tener menos de 0 puntos de vida
        }
    }

    // verifica si el personaje sigue
    public boolean estaVivo() {
        return this.puntosDeVida > 0;
    }

    // devuelve el nombre del personaje
    public String getNombre() {
        return this.nombre;
    }

    // devuelve los puntos de vida actuales
    public int getPuntosDevida() {
        return this.puntosDeVida;
    }
}
