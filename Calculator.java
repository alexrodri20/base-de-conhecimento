public class Calculator {
    public static double add(double a, double b) {return a + b;}
    public static double subtract(double a, double b) {return a - b;}
    public static double multiply(double a, double b) {return a * b;}
    public static double divide(double a, double b) {if(b == 0) throw new IllegalArgumentException("Divisor não pode ser zero"); return a / b;}
    public static void main(String[] args) {
        System.out.println("Teste: 2 + 3 = " + add(2,3));
        System.out.println("Teste: 5 - 2 = " + subtract(5,2));
        System.out.println("Teste: 4 * 3 = " + multiply(4,3));
        System.out.println("Teste: 10 / 2 = " + divide(10,2));
    }
}
