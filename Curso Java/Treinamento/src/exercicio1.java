import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Digite uma frase de sua preferência:");
        String frase = kb.next();

        for (int repeticao = 0; repeticao < 8; repeticao++){
            System.out.println(frase);
        }
    }
}