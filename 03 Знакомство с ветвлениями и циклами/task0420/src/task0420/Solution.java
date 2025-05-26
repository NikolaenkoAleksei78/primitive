package task0420;

import java.io.*;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader1.readLine());
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader2.readLine());
        BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader3.readLine());

        if (a>b) {
            if (b>c) {
                System.out.println(a+" "+b+" "+c);
            }else if (a>c) {
                System.out.println(a+" "+c+" "+b);
            }else System.out.println(c+" "+a+" "+b);
        } else if (a>c) {
            System.out.println(b + " " + a + " " + c);
        }else if (c>b) {
            System.out.println(c + " " + b + " " + a);
        }else System.out.println(b+" "+c+" "+a);
        }
    }
