package task0130;

/* 
Наш первый конвертер!
Метод convertCelsiusToFahrenheit(int celsius) принимает значение в градусах Цельсия. Метод должен переводить температуру и возвращать значение в градусах Фаренгейта.
Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
TF = (9 / 5) * TC + 32

Пример:
В метод convertCelsiusToFahrenheit на вход подается значение 41.

Пример вывода:
105.8


Requirements:
1. Метод convertCelsiusToFahrenheit(int) должен быть публичным и статическим.
2. Метод convertCelsiusToFahrenheit должен возвращать значение типа double.
3. Метод convertCelsiusToFahrenheit не должен ничего выводить на экран.
4. Метод convertCelsiusToFahrenheit должен правильно переводить градусы Цельсия в градусы Фаренгейта и возвращать это число.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        return ((double) (celsius * 9) / 5 + 32);
    }
}