package cursoemvideo;

import java.awt.*;
import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
        Date relogio = new Date();
        System.out.println("A hora do sistema é " + relogio.toString());

        Locale idioma = Locale.getDefault();
        System.out.println("O idioma do sistema é " + idioma.getDisplayLanguage());

        Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
        int largura = tela.width;
        int altura = tela.height;
        System.out.println("Sua tela tem a resolução de " + largura + " x " + altura);
    }
}
