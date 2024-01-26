package exercicios;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Digite uma frase de sua preferência:");
        String frase = kb.next();

        for (int repeticao = 1; repeticao < 8; repeticao++){
            System.out.println(repeticao + ". " + frase);
        }

        kb.close();
    }
}
