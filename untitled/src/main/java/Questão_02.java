import java.util.Scanner;

/**
 * 2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’,
 * seja maiúscula ou minúscula, além de informar a quantidade de vezes em que ela
 * ocorre.
 *
 * IMPORTANTE: Essa string pode ser informada através de qualquer entrada de sua
 * preferência ou pode ser previamente definida no código;
 */
public class Questão_02 {
    public static void main(String[] args) {

        //entrada de dados
        Scanner sc = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.println("Digite um texto:");
        String texto = sc.nextLine();

        // Variável para contar as ocorrências da letra 'a'
        int count = 0;

        // Converte a string para minúsculas para facilitar a contagem
        String minuscula= texto.toLowerCase();

        // Percorre a string e conta as ocorrências da letra 'a'
        for (int i = 0; i < minuscula.length(); i++) {
            if (minuscula.charAt(i) == 'a'||
                    minuscula.charAt(i) == 'ã' ||
                    minuscula.charAt(i) == 'á' ) {
                count++;
            }
        }

        // Exibe o resultado
        if (count > 0) {
            System.out.println("A letra 'a' aparece " + count + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }

        // Fecha o scanner
        sc.close();
    }
}
