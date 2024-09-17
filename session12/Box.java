package ro.siit.session12;

import ro.siit.session11.casting.B;

public class Box<T>{
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(1);
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Alabala");
        // stringBox.setValue(123);
        // Box<int> intBox = new Box<int>();
    }
}
