import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = leitura.nextInt();
        System.out.println("Digite quanto prentende investir: ");
        double valor = leitura.nextDouble();

        System.out.println(nome + " tem " + idade + " anos e pretende investir " + "R$" + valor );
    }
}
