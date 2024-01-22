public class exercicio3 {
    public static void main(String[] args){
        System.out.println("==========================");
        System.out.println(" Números pares de 0 a 100 ");
        System.out.println("==========================");

        for (int repetirPares = 0; repetirPares < 101; repetirPares++){
            if (repetirPares % 2 == 0) System.out.println(repetirPares);
        }
    }
}
