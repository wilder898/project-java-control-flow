public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 7;
        System.out.println("Multiplication table for " + number + ":");

        for (int i = 1; i <= 15; i++) {
        int result = number * i;
        System.out.println(number + " x " + i + " = " + result);
        }
    }
}
