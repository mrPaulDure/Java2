package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] arr = new String[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = i+"";
            }
        }
        try {
            arrException(arr);
        } catch (MyArraySizeException size) {
            System.out.println(size);
        } catch (MyArrayDataException data) {
            System.out.println(data);
        }
    }

    public static void arrException(String[][] arr) throws MyArrayDataException, MyArraySizeException{
        int x = arr.length;
        int y = arr[0].length;
        try {
            if (x != 4 || y != 4) throw new MyArraySizeException();
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    x = i;
                    y = j;
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
            System.out.println("Сумма значений массива: " + sum);
        }catch (NumberFormatException e) {
            throw new MyArrayDataException(x, y);
        }
    }
}
