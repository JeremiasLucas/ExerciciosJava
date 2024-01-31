import java.util.Scanner;

public class EntradaSaida {

    // Função para imprimir a mensagem com base na idade
    public static void imprimirMensagem(String nome, int idade) {
        System.out.print("Seu nome é " + nome + " e ");

        if (idade >= 18) {
            System.out.println("Segura 10.000.");
        } else {
            System.out.println("você é muito baixinha, tal qual Liziane.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Digite o seu nome:");

        String user; // Local que armazena um nome
        Scanner reader = new Scanner(System.in); // criação de objeto para ler o teclado
        user = reader.nextLine(); // Entrada padrão. captura o que foi digitado pelo usuário no teclado

        System.out.println("Digite a sua idade:");

        int idade; // Local que armazena uma idade
        idade = reader.nextInt(); // Lê a idade como um inteiro

        // Chamando a função para imprimir a mensagem
        imprimirMensagem(user, idade);
    }
}