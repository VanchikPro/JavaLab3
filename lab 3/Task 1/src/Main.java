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
        System.out.println("Массив сгенерирован:");
        for (int i = 0; i < n; i++) {
            A[i] = i + 1;
            System.out.print(A[i] + " ");
        }
        System.out.print("\nЭлементы с нечетными номерами в порядке возрастания: ");
        for (int i = 0; i < n; i += 2) {
            System.out.print(A[i] + " ");
        }
        System.out.print("\nЭлементы с четными номерами в порядке убывания: ");
        for (int i = n - (n % 2 == 0 ? 1 : 2); i >= 1; i -= 2) {
            System.out.print(A[i] + " ");
        }
    }
}
