package lesson2;

    class MyArraySizeException extends RuntimeException {
        MyArraySizeException(String e) {
            super("Ошибка размерности массива.\n" + " " + e);
        }

    }

