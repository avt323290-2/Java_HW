// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.

// Sample Input:

// 8
// 11
// Sample Output:

// 512
// 1331
// В коде должно быть предложение пользователю ввести данные


package HW1;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        int[] cubes = new int[1000];
        for (int i = 0; i < cubes.length; i++) {
            cubes[i] = (i + 1) * (i + 1) * (i + 1);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число в диапазоне от 1 до 1000: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число в диапазоне от 1 до 1000: ");
        int b = scanner.nextInt();
        System.out.println("Куб первого числа: " + cubes[a - 1]);
        System.out.println("Куб второго числа: " + cubes[b - 1]);
    }
}
