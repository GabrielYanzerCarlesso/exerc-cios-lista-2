import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada dos valores dos lados do triângulo
        System.out.print("Digite o valor do lado A: ");
        int a = scanner.nextInt();
        
        System.out.print("Digite o valor do lado B: ");
        int b = scanner.nextInt();
        
        System.out.print("Digite o valor do lado C: ");
        int c = scanner.nextInt();
        
        // Verificação se os lados formam um triângulo
        if (a < b + c && b < a + c && c < a + b) {
            // Se formarem um triângulo, verifica o tipo
            if (a == b && b == c) {
                System.out.println("O triângulo é equilátero.");
            } else if (a == b || a == c || b == c) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo.");
        }
        
        scanner.close();
    }
}
