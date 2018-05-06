package ru.geekbrains;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int x, int y) {
        super("Значение массива невозможно преобразовать в int arr[" + x + "][" + y + "]");
    }
}
