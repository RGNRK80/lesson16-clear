package by.overone.lesson17.zoo.entity;

import lombok.Data;

@Data
public abstract class Animal {
      protected int regNumber;  // инв номер
      protected String type;    // тип животного
      protected String name;    // кличка
      protected String sex;     // пол
      protected int age;        // возраст

      public Animal() {
      }

      public Animal(int regNumber, String type, String name, String sex, int age) {
            this.regNumber = regNumber;
            this.type = type;
            this.name = name;
            this.sex = sex;
            this.age = age;
      }

      public Animal(String type, String name, String sex, int age) {
            this.type = type;
            this.name = name;
            this.sex = sex;
            this.age = age;
      }

      public abstract String feed (Meal meal);






}
