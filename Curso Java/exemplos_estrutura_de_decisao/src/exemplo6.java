import java.util.Scanner;

public class exemplo6 {
    static void checkAge(int age){

        if (age <= 17){
            System.out.println("Access denied! You are very young");
        } else {
            System.out.println("Access granted! You are already old enough");
        }

    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        System.out.println("What's your age?");
        int age = kb.nextInt();

        checkAge(age);

        kb.close();
    }
}
