package by.overone.lesson23;

public class Cart <T extends Fruit>{
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public void print(){
        item.clear();
        item.wash();
        item.eat();
    }

}
