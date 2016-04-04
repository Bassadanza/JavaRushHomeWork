package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Петько","Василий");
        map.put("Лазалев","Сергей");
        map.put("Киркоров","Кирилл");
        map.put("Павлов","Хрен");
        map.put("Матчин","Василий");
        map.put("Препод","Влад");
        map.put("Рогачева","Анна");
        map.put("Овсянко","Ксения");
        map.put("Белопольских","Артур");
        map.put("Петраков","Евгений");
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args)
    {

    }
}
