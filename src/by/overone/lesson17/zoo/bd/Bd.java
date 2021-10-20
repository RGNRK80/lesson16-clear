package by.overone.lesson17.zoo.bd;

import by.overone.lesson17.zoo.entity.Animal;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data

public class Bd {
   public static List<Animal> animals=new ArrayList<>();
   public static int invNumber=0;


    public int qetQuantity(){
        return animals.size();
    }
}
