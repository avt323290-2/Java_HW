// task_1. Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”


package HW2;
public class task_1 {
    public static String shuffle(String s, int[] index) {
        char[] shuffled = new char[s.length()]; // создаем массив символов нужной длины
        for (int i = 0; i < s.length(); i++) {  // итерируемся по символам в строке S
            shuffled[index[i]] = s.charAt(i);   // перемещаем символ в нужное место массива
        }
        return new String(shuffled);            // возвращаем новую строку из перемешанных символов
    }

    public static void main(String[] args) {
        String s = "cba";
        int[] index = {3, 2, 1};
        String result = shuffle(s, index);
        System.out.println(result);             // выводим результат "abc"
    }
}