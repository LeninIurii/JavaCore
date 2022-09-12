package lesson2;


    class MyArrayDataException extends RuntimeException {
        MyArrayDataException(String e) {
            super("Ошибка преобразования элемента массива в целое число.\n" + " " + e);
        }

    }

