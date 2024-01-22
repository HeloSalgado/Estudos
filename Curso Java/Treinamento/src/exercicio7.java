import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("======================");
        System.out.println("    Múltilplos de 7   ");
        System.out.println("======================");

        System.out.print("Digite um número de 0 a 200: ");
        int numUser = kb.nextInt();

        for (int repetirMult = 0; repetirMult <= numUser; repetirMult++){
            if (repetirMult % 7 == 0) System.out.println(repetirMult);
        }
    }
}
