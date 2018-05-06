package ru.geekbrains;

public class MyArraySizeException extends Exception {

    public MyArraySizeException() {
        super("Ошибка в размере массива! Массив должен быть 4х4");
    }
}
