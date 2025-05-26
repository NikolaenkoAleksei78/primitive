package task0419;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static java.lang.Math.max;

/* 
Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если максимальных чисел несколько, необходимо вывести любое из них.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader1.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader2.readLine());
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader3.readLine());
        BufferedReader reader4 = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(reader4.readLine());

        int max1, max2, Max;

        max1 = max(a, b);
        max2 = max(c, d);
        Max = max(max1, max2);

        System.out.println(Max);
    }
}
