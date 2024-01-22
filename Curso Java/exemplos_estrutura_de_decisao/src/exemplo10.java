import java.util.Scanner;

public class exemplo10 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int contHumanas = 0;
        int contExatas = 0;

        System.out.println("============================================");
        System.out.println("     QUIZ - CIÊNCIAS HUMANAS OU EXATAS?     ");
        System.out.println("============================================");
        System.out.println("   Digite 1 para Sim e 2 para Não seguido"   );
        System.out.println("--------------------------------------------");

        System.out.println("Você gosta de matemática?");
        int response = kb.nextInt();

        if (response == 1){
            contExatas++;
        }

        System.out.println("Você gosta de ler?");
        response = kb.nextInt();

        if (response == 1) {
            contHumanas++;
        }

        System.out.println("Você se sente atraído a questões de raciocínio lógico?");
        response = kb.nextInt();

        if (response == 1) {
            contExatas++;
        }

        System.out.println("Você se sente atraído a questões sociais?");
        response = kb.nextInt();

        if (response == 1) {
            contHumanas++;
        }

        if (contExatas == contHumanas) {
            System.out.println("Houve empate na pontuação. Não foi possível definir seu perfil.");
        } else if (contExatas > contHumanas){
            System.out.println("Você tem a tendência a CIÊNCIAS EXATAS.");
        } else {
            System.out.println("Você tem a tendência a CIÊNCIAS HUMANAS.");
        }

        System.out.println("Pontuação de Humanas: " + contHumanas);
        System.out.println("Pontuação de Exatas: " + contExatas);



    }
}
