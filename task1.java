import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double temperature;

        System.out.println("Welcome to the Temperature Converter!");

        do {
            System.out.println("\nSelect a conversion type:");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Kelvin to Celsius");
            System.out.println("5. Fahrenheit to Kelvin");
            System.out.println("6. Kelvin to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();

            if (choice >= 1 && choice <= 6) {
                System.out.print("Enter the temperature value: ");
                temperature = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        System.out.printf("%.2f°C is %.2f°F\n", temperature, celsiusToFahrenheit(temperature));
                        break;
                    case 2:
                        System.out.printf("%.2f°F is %.2f°C\n", temperature, fahrenheitToCelsius(temperature));
                        break;
                    case 3:
                        System.out.printf("%.2f°C is %.2fK\n", temperature, celsiusToKelvin(temperature));
                        break;
                    case 4:
                        System.out.printf("%.2fK is %.2f°C\n", temperature, kelvinToCelsius(temperature));
                        break;
                    case 5:
                        System.out.printf("%.2f°F is %.2fK\n", temperature, fahrenheitToKelvin(temperature));
                        break;
                    case 6:
                        System.out.printf("%.2fK is %.2f°F\n", temperature, kelvinToFahrenheit(temperature));
                        break;
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        System.out.println("Thank you for using the Skills Craft Temperature Converter.");
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheitToCelsius(fahrenheit)) + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return (kelvinToCelsius(kelvin)) * 9 / 5 + 32;
    }
}
