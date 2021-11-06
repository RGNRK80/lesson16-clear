package by.overone.lesson19;

import lombok.Data;

@Data
public class Storage {
    int capacity;
    String productType;
    int employee;

    public Storage(int capacity, String productType, int employee) {
        this.capacity = capacity;
        this.productType = productType;
        this.employee = employee;
    }


}
