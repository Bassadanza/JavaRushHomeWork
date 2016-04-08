package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {
        Man Vasya = new Man("Vasya",46,"Moscow");
        Man Petr = new Man("Petr","Krasnoznamensk");
        Woman Katya = new Woman("Katya", 15,"Krasnodar");
        Woman Marina = new Woman("Marina", 22);

        System.out.println(Vasya.name+ " "+Vasya.age+" "+Vasya.address);
        System.out.println(Katya.name+ " "+Katya.age+" "+Katya.address);
        System.out.println(Petr.name+ " "+Petr.age+" "+Petr.address);
        System.out.println(Marina.name+ " "+Marina.age+" "+Marina.address);
    }

    public static class Man{
        String name;
        int age;
        String address;

        Man(String name,int age, String address){
            this.name = name;
            this.age = age;
            this.address =address;
        }
        Man(String name, String adress)
        {
            this.name = name;
            this.age = 20;
            this.address = adress;
        }

        Man(String name,int age)
        {
            this.name = name;
            this.age = age;
            this.address = "Адрес неизвестен";
        }

    }
    public static class Woman{
        String name;
        int age;
        String address;

        Woman(String name,int age, String adress){
            this.name = name;
            this.age = age;
            this.address =adress;
        }
        Woman(String name, String adress)
        {
            this.name = name;
            this.age = 20;
            this.address = adress;
        }

        Woman(String name,int age)
        {
            this.name = name;
            this.age = age;
            this.address = "Адрес неизвестен";
        }
    }

}
