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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("=== Calculadora ===");
            System.out.println("Escolha a operação: (+, -, *, /, %), ou 'sair' para encerrar");
            String op = scanner.next();
            if (op.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando a calculadora.");
                break;
            }
            System.out.print("Primeiro número: ");
            double a = scanner.nextDouble();
            System.out.print("Segundo número: ");
            double b = scanner.nextDouble();
            double result;
            switch (op) {
                case "+": result = add(a, b); break;
                case "-": result = subtract(a, b); break;
                case "*": result = multiply(a, b); break;
                case "/": result = divide(a, b); break;
                case "%": result = modulus(a, b); break;
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
