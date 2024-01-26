package exercicios;

import java.util.Scanner;

public class exercicio6 {
    public static  void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.print("Digite um número de 20 a 100: ");
        int numUsuario = kb.nextInt();

        for (int repeticao = 0; repeticao <= numUsuario; repeticao++){
            if (repeticao % 5 == 0) {
                System.out.println(repeticao);
            }
        }

        kb.close();
    }
}
