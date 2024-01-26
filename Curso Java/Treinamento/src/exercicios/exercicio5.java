package exercicios;

import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Qual o nome da pessoa que você mais ama?");
        String pessoaAmada = kb.next();

        System.out.println("E o quanto você a ama?");
        int quantAmor = kb.nextInt();

        for (int repetirAmor = 1; repetirAmor <= quantAmor; repetirAmor++){
            System.out.println(repetirAmor + " - " + pessoaAmada + ", eu te amo! Sempre lembre disso! ");
        }

        kb.close();
    }
}
