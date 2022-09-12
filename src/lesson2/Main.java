

package lesson2;

/*  1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4, при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
    2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено исключение MyArrayDataException, с детализацией в какой именно ячейке лежат неверные данные.
    3. В методе main() вызвать полученный метод, обработать возможные исключения MySizeArrayException и MyArrayDataException, и вывести результат расчета.
*/

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {

        String[][] stringArray0 = new String[][] {
                {"6", "4", "11", "8"},
                {"5", "9", "8", "c"},
                {"3", "6", "5", "6"},
                {"5", "8", "4", "2"}
        };
        String[][] stringArray1 = new String[][] {
                {"5", "6", "3", "4"},
                {"1", "2", "3", "4"},
                {"3", "6", "5", "6"},
                {"5", "8", "4", "2"}
        };
        String[][] stringArray2 = new String[][] {
                {"5", "g", "3"},
                {"1", "2", "3", "4"},
                {"3", "6", "5", "6"},
                {"5", "8", "4", "2"}
        };
        String[][] stringArray3 = new String[][] {
                {"1", "2", "3", "4"},
                {"3", "6", "5", "6"},
                {"5", "8", "4", "2"}
        };

        try {
            System.out.println("Сумма элементов массива 0 равна: " + transformAndSum(stringArray0));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива 1 равна: " + transformAndSum(stringArray1));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива 2 равна: " + transformAndSum(stringArray2));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
        try {
            System.out.println("Сумма элементов массива 3 равна: " + transformAndSum(stringArray3));
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e);
        }
    }

    private static int transformAndSum (String[][] array) throws MyArraySizeException, MyArrayDataException {
        int arrDim = 4;
        int sum = 0;

        // Проверяем, что у массива 4 основных измерения
        if (array.length != 4) {
            throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
        }
        // Т.к. размерность вложенных массивов может быть не всегда одинакова, то проверяем, что в каждом из 4-х основных измерений находится массив ровно из 4 элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += valueOf(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s.", i, j, array[i][j]));
                }
            }
        }

        return sum;
    }

}



