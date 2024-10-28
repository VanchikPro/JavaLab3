import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите размер массива: ");
        if (!scanner.hasNextInt()) {
            System.out.println("Ошибка: Размер массива должен быть целым числом.");
            return;
        }
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Ошибка: Размер массива должен быть больше 0.");
            return;
        }
        int[] A = new int[n];
        Random random = new Random();
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(100) + 1;
            System.out.print(A[i] + " ");
        }
        int count = 0;
        boolean decr = false;
        for (int i = 1; i < n; i++) {
            if (A[i] < A[i - 1]) {
                if (!decr) {
                    decr = true;
                    count++;
                }
            } else {
                decr = false;
            }
        }
        System.out.println("\nКоличество убывающих участков: " + count);
    }
}
