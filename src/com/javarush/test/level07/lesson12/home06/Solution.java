package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        Human grandma = new Human("grandma",false, 74);
        Human grandpa = new Human("grandpa",true, 79);
        Human grandma2 = new Human("grandma1",false, 74);
        Human grandpa2 = new Human("grandpa1",true, 79);
        Human father = new Human("father",true,39,grandpa,grandma);
        Human mother = new Human("mother",false, 40,grandpa2,grandma2);
        Human kid1 = new Human("kid1",true,7,father,mother);
        Human kid2 = new Human("kid2",false,10,father,mother);
        Human kid3 = new Human("kid3",false,7,father,mother);

        System.out.println(grandma.toString());
        System.out.println(grandpa.toString());
        System.out.println(grandma2.toString());
        System.out.println(grandpa2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(kid1.toString());
        System.out.println(kid2.toString());
        System.out.println(kid3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human(String name,boolean sex,int age,Human father,Human mother){
            this.name = name;
            this.sex = sex;
            this.age=age;
            this.father = father;
            this.mother=mother;
        }

        Human(String name,boolean sex,int age){
            this.name = name;
            this.sex = sex;
            this.age=age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
