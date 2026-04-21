/*Crie uma classe Carro com atributos modelo,
ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.*/

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O ano do carro é: " + ano);
        System.out.println("A cor do carro é: " + cor);
    }

    int calcularIdade(int ano){
        return 2025 - ano;
    }

}
