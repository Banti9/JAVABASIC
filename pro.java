
    import java.util.Scanner;

public class pro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unit Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Kilometers to Miles");
        System.out.println("4. Miles to Kilometers");
        System.out.println("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                celsiusToFahrenheit();
                break;
            case 2:
                fahrenheitToCelsius();
                break;
            case 3:
                kilometersToMiles();
                break;
            case 4:
                milesToKilometers();
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    public static void celsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        scanner.close();
    }

    public static void fahrenheitToCelsius() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);

        scanner.close();
    }

    public static void kilometersToMiles() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();
        double miles = kilometers / 1.60934;
        System.out.println("Distance in miles: " + miles);

        scanner.close();
    }

    public static void milesToKilometers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance in miles: ");
        double miles = scanner.nextDouble();
        double kilometers = miles * 1.60934;
        System.out.println("Distance in kilometers: " + kilometers);

        scanner.close();
    }
}

