package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        map.put("Toropin","Dmitry");
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int countName=0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            String value = pair.getValue();
            if (name.equals(value)) countName++;

        }
        return countName;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int countFamiliya=0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            String key = pair.getKey();
            if (familiya.equals(key)) countFamiliya++;

        }
        return countFamiliya;
    }
}
