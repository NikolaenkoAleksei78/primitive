package task0214;

/* 
Минимум двух чисел
Написать функцию, которая возвращает минимум из двух чисел.

Подсказка:
Нужно написать тело существующей функции min.


Requirements:
1. Программа должна выводить текст на экран.
2. Метод min не должен выводить текст на экран.
3. Метод main должен вызвать метод min три раза.
4. Метод main должен выводить на экран результат работы метода min. Каждый раз с новой строки.
5. Метод min должен возвращать минимальное значение из чисел a и b.*/

public class Solution {
    public static int min(int a, int b) {
        //напишите тут ваш код
        if (a<b){
            return a;
        }
        else return b;
    }

    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
