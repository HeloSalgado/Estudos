package exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        ArrayList<String> destinos = new ArrayList<String>();

        System.out.println("Digite o destino de viagem:");
        String destinoUsuario = kb.next();

        destinos.add(destinoUsuario);

        kb.close();
    }
}
