public class WeatherAdvisor {
    public static void main(String[] args) {
        int temperature = 35; // Temperatura en grados Celsius

        System.out.println("La temperatura es: " + temperature + "°C.");

        if (temperature > 30) {
            System.out.println("Es un dia caluroso, recuerda tomar agua.");
        } else if (temperature < 20) {
            System.out.println("Es un dia lindo, disfruta del clima.");
        } else if (temperature > 10) {
            System.out.println();}
        else {
            System.out.println("Es un dia frio, abrígate bien.");
        }
    }
}
