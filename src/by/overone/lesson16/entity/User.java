package by.overone.lesson16.entity;


import lombok.Data;

@Data
public class User {

   private long id;
   private String name;
   private String surname;
   private int age;
   private String phoneNumber;

   public User() {

   }

   public User(String name, String surname, int age, String phoneNumber) {

      this.name = name;
      this.surname = surname;
      this.age = age;
      this.phoneNumber = phoneNumber;
   }

   public User(User user) {
      id= user.id;
      name=user.name;
      surname=user.surname;
      age= user.age;
      phoneNumber=user.phoneNumber;
   }
   public void out (String name) {
      this.name=name+"1";
   }


  /* @Override
   public String toString() {
      return
              "id: " + id + ","+
              " name: " + name + "," +
              " surname: " + surname + "," +
              " age: " + age + ","+
              " phoneNumber: " + phoneNumber ;
   } */
}
