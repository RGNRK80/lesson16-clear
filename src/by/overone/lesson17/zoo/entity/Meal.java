package by.overone.lesson17.zoo.entity;

import lombok.Data;

@Data
public class Meal {
    private String type;

    public Meal(String type) {
        this.type = type;
    }
}