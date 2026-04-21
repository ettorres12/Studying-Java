import java.util.Scanner;

public class Testando {
    public static void main(String[] args) {

        /*Crie um programa que solicite ao usuário digitar um número.
        Se o número for positivo, exiba "Número positivo",
        caso contrário, exiba "Número negativo".

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero");
        int numero = leitura.nextInt();

        if(numero < 0){
            System.out.println("O numero é negativo");
        }else{
            System.out.println("O numero é positivo");
        }*/

        /*Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem
        indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int primeironum = leitura.nextInt();
        System.out.println("Digite o segundo numero");
        int segundonum = leitura.nextInt();

        if(primeironum == segundonum){
            System.out.println("Os numeros são iguais");
        } else {
            System.out.println("Os numeros são diferentes");
        }

        if (primeironum > segundonum){
            System.out.println("Primeiro numero é maior");
        }else {
            System.out.println("Segundo numero é maior");
        }*/

        /*Crie um menu que oferece duas opções ao usuário: "1. Calcular área do quadrado" e "2.
        Calcular área do círculo".
         Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.


        Scanner leitura = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3){
            System.out.println("---Menu---");
            System.out.println("1. Calcular area do quadrado");
            System.out.println("2. Calcular area do circulo");
            System.out.println("3. Sair");
            System.out.println("Escolha uma opção: ");
            escolha = leitura.nextInt();

            if(escolha == 1){
                System.out.println("Digite o lado do quadrado: ");
                int ladoQuadrado = leitura.nextInt();
                int areaQuadrado = ladoQuadrado * ladoQuadrado;
                System.out.println("A are do quadrado e: " + areaQuadrado);
            }else if (escolha == 2){
                System.out.println("Digite o raio do circulo");
                double raio = leitura.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("A are do circulo é: " + areaCirculo);
            }else if (escolha == 3){
                System.out.println("Programa encerrado");
            }else{
                System.out.println("Opção invalida");
            }
        }*/


        /*Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();

        System.out.println("Tabuada do numero " + numero);
        for (int i = 1; i < 10; i++) {
            System.out.println(numero + "x" + i + "= " + (numero * i));

        }*/

        /*Crie um programa que solicite ao usuário a entrada de um número inteiro.
         Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.


        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = leitura.nextInt();

        if(numero % 2 == 0){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }*/

        /*Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.*/




    }
}
