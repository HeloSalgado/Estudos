import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a primeira nota:");
        float n1 = teclado.nextFloat();

        System.out.println("Insira a segunda nota:");
        float n2 = teclado.nextFloat();

        System.out.println("Insira a terceira nota:");
        float n3 = teclado.nextFloat();

        double media = (n1 + n2 + n3) / 3;

        if (media <= 5){
            System.out.println("Reprovou, vai fazer tudo de novo!");
        } else {
            System.out.println("Aprovado, parabéns!!!");
        }

        teclado.close();
    }
}
