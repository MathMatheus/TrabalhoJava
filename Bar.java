import java.util.Scanner;

public class Bar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        int quantidadeCervejas = scanner.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        int quantidadeRefrigerantes = scanner.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        int quantidadeEspetinhos = scanner.nextInt();

        // Cálculo dos valores
        double ingresso = (sexo == 'M') ? 10.0 : 8.0;
        double consumo = (quantidadeCervejas * 5) + (quantidadeRefrigerantes * 3) + (quantidadeEspetinhos * 7);
        double couvert = (consumo > 30) ? 0 : 4.0;

        double valorTotal = ingresso + consumo + couvert;

        // Exibição do relatório
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Consumo = R$ %.2f%n", consumo);
        System.out.printf("Couvert = R$ %.2f%n", couvert);
        System.out.printf("Ingresso = R$ %.2f%n", ingresso);
        System.out.printf("\nValor a pagar = R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
