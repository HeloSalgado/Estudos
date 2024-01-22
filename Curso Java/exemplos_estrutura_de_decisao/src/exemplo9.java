import java.util.Scanner;

public class exemplo9 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Qual tabuada deseja visualizar?");
        int numTabuada = kb.nextInt();

        if (numTabuada > 0){
            for (int repeticao = 1; repeticao < 11; repeticao++){
                System.out.println(numTabuada + "x" + repeticao + "=" + numTabuada * repeticao);
            }
        } else {
            System.out.println("Digite um  número válido!");
        }


        kb.close();
    }
}
