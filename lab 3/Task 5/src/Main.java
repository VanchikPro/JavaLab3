import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            Menu();
            int choice = Choice(scanner);
            switch (choice) {
                case 1:
                    double[] parameters = Parameters(scanner);
                    double energy = KineticEnergy(parameters);
                    System.out.printf("Кинетическая энергия объекта в Джоулях: %.2f\n", energy);
                    break;
                case 2:
                    ProgramInfo();
                    break;
                case 3:
                    MyInfo();
                    break;
                case 4:
                    System.out.println("Выход из программы...");
                    exit = true;
                    break;
            }
        }
        scanner.close();
    }

    // Меню
    public static void Menu() {
        System.out.println("\n--- Главное меню ---");
        System.out.println("1. Выполнить расчет");
        System.out.println("2. Информация о программе");
        System.out.println("3. Информация о разработчике");
        System.out.println("4. Выход");
        System.out.print("Выберите опцию: ");
    }

    // Корректный выбор опции меню
    public static int Choice(Scanner scanner) {
        while (true) {
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 4) {
                    return choice;
                } else {
                    System.out.print("Ошибка: выберите опцию от 1 до 4. \nПовторите ввод: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Ошибка: введите число. \nПовторите ввод: ");
            }
        }
    }

    // Получение параметров расчета и возврат их в виде массива
    public static double[] Parameters(Scanner scanner) {
        double mass = ValidMass(scanner);
        double speed = ValidSpeed(scanner);
        return new double[]{mass, speed}; // Массив для хранения массы и скорости
    }

    // Корректная масса
    public static double ValidMass(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Введите массу объекта в килограммах: ");
                double mass = Double.parseDouble(scanner.nextLine());
                if (mass > 0) {
                    return mass;
                } else {
                    System.out.println("Ошибка: масса должна быть положительным числом.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }

    // Корректная скорость
    public static double ValidSpeed(Scanner scanner) {
        while (true) {
            try {
                System.out.print("Введите скорость объекта в метрах в секунду: ");
                double speed = Double.parseDouble(scanner.nextLine());
                if (speed >= 0) {
                    return speed;
                } else {
                    System.out.println("Ошибка: скорость не может быть отрицательной.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }

    // Расчет кинетической энергии с использованием массива параметров
    public static double KineticEnergy(double[] parameters) {
        double mass = parameters[0];
        double speed = parameters[1];
        return 0.5 * mass * Math.pow(speed, 2);
    }

    // Информация о программе
    public static void ProgramInfo() {
        System.out.println("Эта программа рассчитывает кинетическую энергию объекта по формуле: E = 0.5 * m * v^2.");
    }

    // Информация о разработчике
    public static void MyInfo() {
        System.out.println("Разработчик программы: Дорофиенко Иван Сергеевич РТМ-140970.");
    }
}