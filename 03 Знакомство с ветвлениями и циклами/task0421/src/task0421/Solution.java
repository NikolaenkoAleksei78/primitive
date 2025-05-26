package task0421;

import java.io.*;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader1.readLine();
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        String name2 = reader2.readLine();

        int nl1 = name1.length();
        int nl2 = name2.length();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (nl1==nl2){
            System.out.println("Длины имен равны");
            }
        }

    }
