import java.util.Scanner;

public class exemplo8 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Insira seu nome:");
        String nome = kb.next();

        // StringBuilder é mutável (diferente da String), sendo possível inverter a palavra, adicionar mais palavras, etc.
        StringBuilder nomeReverso = new StringBuilder(nome); // objeto
        nomeReverso.append(" Salgado");
        nomeReverso.reverse();

        System.out.println("Insira a temperatura em graus Celsius:");
        double tempCel = kb.nextDouble();

        double tempFah = tempCel * 9/5 + 32; // fórmula para calcular a temperatura de Celsius para Fahrenheit

        System.out.println(nomeReverso + " a temperatura em Fahrenheit é: " + tempFah);

        kb.close();
    }
}
