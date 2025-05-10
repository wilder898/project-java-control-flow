import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Número aleatorio entre 1 y 100
        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Estoy pensando en un número entre 1 y 100. ¿Puedes adivinarlo?");

        while (true) {
            System.out.print("Ingrese su suposición: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("¡Demasiado bajo! Inténtalo de nuevo.");
            } else if (guess > numberToGuess) {
                System.out.println("¡Demasiado alto! Inténtalo de nuevo.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número en: " + attempts + " intentos.");
                break;
            }
        }

        scanner.close();
    }
}
