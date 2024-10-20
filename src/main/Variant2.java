package main;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Variant2 {
    public double[] arrayTask(int arraySize) {
        double[] arr = new double[arraySize];
        for (int i = 1; i < arraySize; i++) {
            arr[i] = Math.pow(2.0, i);
        }
        return arr;

    }

    public boolean booleanTask(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }

    public String switchTask(int rating) {
        switch (rating) {
            case 1:
                return "Погано";
            case 2:
                return "Незадовільно";
            case 3:
                return "Задовільно";
            case 4:
                return "Добре";
            default:
                return "Помилка";
        }
    }

    public int forTask(int a, int b) {
        int n = 0;
        for (int i = a; i <= b; i++) {
            System.out.println(i);
            n += 1;
        }
        return n;
    }

    public int ifTask(int n) {
        if (n >= 0) n += 1;
        else n -= 2;
        return n;
    }

    public int integerNumbersTask(int m) {
        ;
        int result = m / 1000;
        return result;
    }

    public int[][] twoDimensionArrayTask(int row, int columns, int juser) {
        int[][] arr = new int[row][columns];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = i;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (arr[i][j] == juser) {
                    arr[i][j] = juser * 5;
                }
            }
        }

        return arr;
    }

    public int whileTask(int a, int b) {
        int count = 1;
        int fix = b;
        while (b != a) {
            b += fix;
            count++;
        }
        return count;
    }
}
