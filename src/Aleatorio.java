import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(101);
        int tentativa;
        int maxTentativas = 5;

        System.out.println("Tente adivinhar um numero entre 0 e 100");

        for (int i = 0; i <= maxTentativas; i++) {
            System.out.println("Tentativas " + i + ":" );
            tentativa = leitura.nextInt();

            if(tentativa == numeroSecreto){
                System.out.println("Parabens! Você acertou");
                break;
            } else if (tentativa < numeroSecreto) {
                System.out.println("O numero secreto é maior");
            } else {
                System.out.println("O numero secreto é menor");
            }

            if(i == maxTentativas){
                System.out.println("Você perdeu! O numero secreto era: " + numeroSecreto);
            }

        }
        leitura.close();


    }
}
