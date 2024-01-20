import java.util.Scanner;

public class exemplo4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número limite:");
        int numLimite = teclado.nextInt();

        for (int repeticao = 0; repeticao <= numLimite; repeticao++){
            System.out.println(repeticao);
        }

        teclado.close();
    }
}
