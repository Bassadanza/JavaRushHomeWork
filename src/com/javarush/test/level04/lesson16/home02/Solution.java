package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
//Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] mas=new int[3];
        for(int i=0; i<mas.length; i++)
        {
            mas[i]=Integer.parseInt(reader.readLine());
        }
        Arrays.sort(mas);
        System.out.println(mas[1]);
    }
}