import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu usuário:");
        String usuario = teclado.next();

        System.out.println("Digite sua senha:");
        int senha = teclado.nextInt();

        if (usuario.equals("admin") && senha == 123456){
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        teclado.close();
    }
}