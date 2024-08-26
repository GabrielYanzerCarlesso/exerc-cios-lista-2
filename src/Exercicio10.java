import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exibição do menu de produtos
        System.out.printf("Lista de produtos e preços:\n" +
                          "1. Banana: R$ 0,30/un (menos de 12) ou R$ 0,25/un (12 ou mais)\n" +
                          "2. Laranja: R$ 0,40/un (menos de 12) ou R$ 0,35/un (12 ou mais)\n" +
                          "3. Maçã: R$ 0,50/un (menos de 12) ou R$ 0,45/un (12 ou mais)\n" +
                          "4. Kiwi: R$ 0,40/un (menos de 12) ou R$ 0,30/un (12 ou mais)\n");
        
        // Solicitar a escolha do produto
        System.out.print("Digite o número correspondente ao produto desejado: ");
        int produtoEscolhido = scanner.nextInt();
        
        // Solicitar a quantidade de produto
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = scanner.nextInt();
        
        // Validação da quantidade
        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
        } else {
            double precoPorUnidade = 0.0;
            
            // Determinar o preço por unidade com base no produto e na quantidade
            switch (produtoEscolhido) {
                case 1: // Banana
                    precoPorUnidade = (quantidade < 12) ? 0.30 : 0.25;
                    break;
                case 2: // Laranja
                    precoPorUnidade = (quantidade < 12) ? 0.40 : 0.35;
                    break;
                case 3: // Maçã
                    precoPorUnidade = (quantidade < 12) ? 0.50 : 0.45;
                    break;
                case 4: // Kiwi
                    precoPorUnidade = (quantidade < 12) ? 0.40 : 0.30;
                    break;
                default:
                    System.out.println("Opção de produto inválida.");
                    scanner.close();
                    return;
            }
            
            // Calcular o valor total da compra
            double valorTotal = quantidade * precoPorUnidade;
            
            // Exibir o valor total formatado com duas casas decimais
            System.out.printf("O valor total da compra é: R$ %.2f%n", valorTotal);
        }
        
        scanner.close();
    }
}
