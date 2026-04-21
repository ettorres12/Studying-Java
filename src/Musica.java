/*Crie uma classe Musica com atributos titulo, artista, anoLancamento,
avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar
a música e calcular a média de avaliações.*/

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaAvaliacoes;
    int numAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println("O titulo da musica é: " + titulo);
        System.out.println("O artista é: " + artista);
        System.out.println("O ano de lançamento da musica é: " + anoLancamento);
    }

    void avaliaMusica(double nota){
        somaAvaliacoes += nota;
        numAvaliacoes++;
    }

    double mediaAvaliaçoes(){
        return somaAvaliacoes /numAvaliacoes;
    }

}
