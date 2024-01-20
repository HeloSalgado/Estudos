import java.util.Scanner;

public class exemplo7 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("Write the first number:");
        double num1 = kb.nextDouble();

        System.out.println("Write the second number:");
        double num2 = kb.nextDouble();

        System.out.println("What's operation do you want?");
        String operation = kb.next();

        double result;

        switch (operation) {

            case "+" -> {
                result = num1 + num2;
            }
            case "-" -> {
                result = num1 - num2;
            }
            case "/" -> {
                result = num1 / num2;
            }
            default -> {
                result = num1 * num2;
            }
        }


        System.out.println("The result of operation " + operation + " is: " + result);

        kb.close();

    }

}
