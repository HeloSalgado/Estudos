package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio8 { // buscando frutas na array
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> frutas = new ArrayList<String>();

        frutas.add("morango");
        frutas.add("melão");
        frutas.add("banana");
        frutas.add("uva");

        System.out.print("Digite o nome de uma fruta: ");
        String frutaUsuario = kb.next();

        for (int posicao = 0; posicao < frutas.size(); posicao++) {
            if (frutaUsuario.toLowerCase().equals(frutas.get(posicao))){
                System.out.println("A fruta " + frutas.get(posicao) + " existe na lista.");
                break;
            } else if (posicao == 3) {
                System.out.print("Não existe a fruta " + frutaUsuario + " na lista.");
            }

        }

        kb.close();
    }
}
