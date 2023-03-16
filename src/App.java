import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int busca;
        boolean result;

        System.out.println("Numero para buscar");
        Scanner sc = new Scanner(System.in);
        busca = sc.nextInt();

        result = Fibonacci(busca);
        if (result == true) {
            System.out.println("\n Numero " + busca + " pertence a Fibonacci com 30 repetiçoes");
        } else {
            System.out.println("\n Numero " + busca + " não pertence a Fibonacci com 30 repetiçoes");
        }
        sc.close();
    }

    private static boolean Fibonacci(int busca) {
        int num1 = 1, num2 = 0;

        for (int i = 0; i < 30; i++) {
            num1 = num1 + num2;
            num2 = num1 - num2;
            if (busca == num1) {
                return true;
            }
        }
        return false;
    }

}
