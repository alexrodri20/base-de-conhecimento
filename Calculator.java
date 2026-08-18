import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {return a + b;}
    public static double subtract(double a, double b) {return a - b;}
    public static double multiply(double a, double b) {return a * b;}
    public static double divide(double a, double b) {
        if(b == 0) throw new IllegalArgumentException("Divisor não pode ser zero");
        return a / b;
    }
    public static double modulus(double a, double b) {
        if(b == 0) throw new IllegalArgumentException("Divisor não pode ser zero");
        return a % b;
    }

    private static void printMenu() {
        System.out.println("=== Calculadora ===");
        System.out.println("Escolha a operação digitando o símbolo (+, -, *, /, %) ou 'sair' para encerrar:");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            printMenu();
            String op = scanner.next();
            if (op.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando a calculadora.");
                break;
            }
            double a, b;
            try {
                System.out.print("Primeiro número: ");
                a = scanner.nextDouble();
                System.out.print("Segundo número: ");
                b = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira números válidos.");
                scanner.nextLine(); // limpa o buffer
                continue;
            }
            double result;
            switch (op) {
                case "+": result = add(a, b); break;
                case "-": result = subtract(a, b); break;
                case "*": result = multiply(a, b); break;
                case "/":
                    try {
                        result = divide(a, b);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                case "%":
                    try {
                        result = modulus(a, b);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operação desconhecida.");
                    continue;
            }
            System.out.println("Resultado: " + result);
            System.out.println();
        }
        scanner.close();
    }
}
