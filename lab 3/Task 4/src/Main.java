import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите количество строк: ");
        int m;
        try {
            m = Integer.parseInt(scanner.nextLine());
            if (m < 1) {
                System.out.println("Ошибка: Количество строк должно быть больше 0.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное значение. Количество строк должно быть целым числом.");
            return;
        }

        System.out.print("Укажите количество столбцов: ");
        int n;
        try {
            n = Integer.parseInt(scanner.nextLine());
            if (n < 1) {
                System.out.println("Ошибка: Количество столбцов должно быть больше 0.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Введено некорректное значение. Количество столбцов должно быть целым числом.");
            return;
        }

        int[][] matrix = new int[m][n];
        Random random = new Random();
        System.out.println("Сгенерированная матрица:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(100) + 1;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Столбцы в чередовании:");
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < m; i++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                for (int i = m - 1; i >= 0; i--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}