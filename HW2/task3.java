//Task_3.*
//public class Task3 {
// 
// Напишите программу, которая
// 1) по указанной строке URL скачивает файл и возвращает строковое содержимое файла
// 2) изменяет строковое содержимое файла подставляя по маске "%s" ваше имя
// 3) сохраняет файл локально
// 4) читает сохраненный файл и выводит содержимое в логгер
// 5) удаляет сохраненный файл
// public static void main(String[] args) {
//     String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fileUrl = "https://raw.githubusercontent.com/aksodar/JSeminar_2/master/src/main/resources/example.txt";
        String localFilename = "example.txt";

        // Запрос имени пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        Task3 task = new Task3();

        // Скачивание файла
        String fileContent = task.download(fileUrl, localFilename);

        // Замена содержимого файла
        String changedContent = task.change(name, fileContent);

        // Сохранение файла локально
        task.saveOnLocal(localFilename, changedContent);

        // Чтение сохраненного файла и вывод содержимого в логгер
        task.read(localFilename);

        // Удаление сохраненного файла
        task.removeFromLocale(localFilename);
    }

    public String download(String url, String localFilename) {
        // код для скачивания файла по URL и возврата его содержимого в виде строки
        return "";
    }

    public String change(String name, String fileContent) {
        // код для замены содержимого файла по маске и возврата измененного содержимого в виде строки
        return "";
    }

    public void read(String localFilename){
        // код для чтения содержимого файла и вывода его в логгер
    }

    public void saveOnLocal(String fileName, String fileContent) {
        // код для сохранения файла локально
    }

    public boolean removeFromLocale(String fileName) {
        // код для удаления сохраненного файла
        return false;
    }
}
