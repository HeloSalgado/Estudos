public class exercicio4 {
    public static void main(String[] args){
        System.out.println("==========================");
        System.out.println("    Números de 1 a 30     ");
        System.out.println("==========================");

        for (int repeticao = 1; repeticao < 31; repeticao++){
            if (repeticao != 3 && repeticao != 4 && repeticao != 7 && repeticao != 10 && repeticao != 12) {
                System.out.println(repeticao);
            }
        }
    }
}
