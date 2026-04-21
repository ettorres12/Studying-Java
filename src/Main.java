
public class Main {
    public static void main(String[] args) {

        /*System.out.printf("Temperaturas");
        System.out.println("\n");

        double temperaturaCelsius = 37.7;

        int celciusFahrenheit = (int) (temperaturaCelsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + celciusFahrenheit);
        System.out.println("\n");


        medias

        double nota1 = 7.1;
        double nota2 = 9.2;
        double media = (nota1 + nota2)/2;

        System.out.println("A media das notas é: " + media);
        System.out.println("\n");


        /*Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double num1 = 8.7;
        int num2 = (int) num1;

        System.out.println("O casting de double para int é: " + num2);
        System.out.println("\n");

        /*Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letra = 'M';
        String palavra= "ARIA";

        String mensagem = "A letra é: " + letra + " e a palavra é: " + (letra + palavra);
        System.out.println(mensagem);
        System.out.println("\n");

        /*Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total
         multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

        double precoProduto = 20.50;
        int quantidade = 3;

        double valorTotal = precoProduto * quantidade;

        System.out.println("O valor total da compra e: R$" + valorTotal);
        System.out.println("\n");

        /*Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
        Considere que o valor de 1 dólar é equivalente a 4.94 reais.
        Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

        double valorEmDolares = 5.0;

        double valorEmReais = valorEmDolares * 4.94;

        System.out.println("O valor em reais é: R$" + valorEmReais);
        System.out.println("\n");

        /*Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável,
        representando o preço original de um produto. Em seguida, declare uma variável do tipo double
        percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

        double precoOriginal = 52.50;
        double percentualDesconto = 10.0;
        double valorcomDesconto = (percentualDesconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - valorcomDesconto;

        System.out.println("Preço original: " + precoOriginal);
        System.out.println("Desconto: " + valorcomDesconto);
        System.out.println("Valor final: " + valorFinal);
     */

        int dia = 4;
        String nomeDia;

        switch (dia){
            case 1:
                nomeDia = "Domingo";
            break;

            case 2:
                nomeDia = "Segunda";
            break;

            case 3:
                nomeDia = "Terça";
            break;

            case 4:
                nomeDia = "Quarta";
            break;

            case 5:
                nomeDia = "Quinta";
            break;

            case 6:
                nomeDia = "Sexta";
            break;

            case 7:
                nomeDia = "Sabado";
            break;

            default:
                nomeDia = "Invalido";
            break;
        }

        System.out.println("O dia " + dia + " é: " + nomeDia);



    }
}
