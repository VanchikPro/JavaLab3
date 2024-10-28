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
        System.out.println("Случайно сгенерированный массив A:");
        for (int i = 0; i < n; i++) {
            A[i] = random.nextInt(100) + 1;
            System.out.print(A[i] + " ");
        }
        int[] B = calculateB(A);
        System.out.println("\nСформированный массив B:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }
    }
    public static int[] calculateB(int[] A) {
        int n = A.length;
        int[] B = new int[n];
        int sum = 0;
        for (int k = 0; k < n; k++) {
            sum += A[k];
            B[k] = sum / (k + 1);
        }
        return B;
    }
}
