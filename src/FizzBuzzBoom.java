import java.util.Scanner;

public class FizzBuzzBoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese inicio del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el final del rango: ");
        int fin = scanner.nextInt();

        if (inicio > fin) {
            System.out.println("El inicial debe ser menor o igual al final.");
            return;
        }

        for (int i = inicio; i <= fin; i++) {
            boolean multiplo3 = i % 3 == 0;
            boolean multiplo5 = i % 5 == 0;
            boolean multiplo7 = i % 7 == 0;

            if (multiplo3 && multiplo5 && multiplo7) {
                System.out.println("FizzBuzzBoom");
            } else if (multiplo3 && multiplo5) {
                System.out.println("FizzBuzz");
            } else if (multiplo3 && multiplo7) {
                System.out.println("FizzBoom");
            } else if (multiplo5 && multiplo7) {
                System.out.println("BuzzBoom");
            } else if (multiplo3) {
                System.out.println("Fizz");
            } else if (multiplo5) {
                System.out.println("Buzz");
            } else if (multiplo7) {
                System.out.println("Boom");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
