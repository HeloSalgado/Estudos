import java.util.Scanner;

public class exemplo3 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Descubra se a multiplicação dos números é ímpar ou par!");

        System.out.println("Digite o primeiro número:");
        int n1 = teclado.nextInt();

        System.out.println("Digite o segundo número:");
        int n2 = teclado.nextInt();

        int multiplicacao = n1 * n2;

        if (multiplicacao % 2 == 0){
            System.out.println("O resultado deu: " + multiplicacao + ", e é par");
        } else {
            System.out.println("O resultado deu: " + multiplicacao + ", e é ímpar");
        }

        teclado.close();

    }
}
