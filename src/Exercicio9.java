import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar a quantidade de laranjas
        System.out.print("Digite o número de laranjas compradas: ");
        int quantidade = scanner.nextInt();
        
        // Validação da quantidade
        if (quantidade <= 0) {
            System.out.println("A quantidade de laranjas deve ser maior que zero.");
        } else {
            double precoPorLaranja;
            
            // Verificar o preço de acordo com a quantidade comprada
            if (quantidade < 12) {
                precoPorLaranja = 0.30;
            } else {
                precoPorLaranja = 0.25;
            }
            
            // Calcular o valor total
            double valorTotal = quantidade * precoPorLaranja;
            
            // Exibir o valor total formatado com duas casas decimais
            System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);
        }
        
        scanner.close();
    }
}
