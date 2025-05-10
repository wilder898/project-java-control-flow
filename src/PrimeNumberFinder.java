import java.util.Scanner;

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int number = 2;

        System.out.print("¿Cuántos números primos quieres encontrar? ");
        int maxPrimes = scanner.nextInt();

        System.out.println("primeros " + maxPrimes + " numeros primos:");

        while (count < maxPrimes) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
                count++;
            }

            number++;
        }

        scanner.close();
    }
}