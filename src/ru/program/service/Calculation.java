package ru.program.service;

public class Calculation {
    public void calculationExample(String task) {

        String[] array = task.split(" ");

        System.out.print("Результат вычисления " + task + " = ");
        try {
            int firstElement = Integer.parseInt(array[0]);
            int secondElement = Integer.parseInt(array[2]);
            String operation = array[1];

            switch (operation) {
                case ("+"):
                    System.out.print(firstElement + secondElement + "\n");
                    break;
                case ("-"):
                    System.out.print(firstElement - secondElement + "\n");
                    break;
                case ("*"):
                    System.out.print(firstElement * secondElement + "\n");
                    break;
                case ("/"):
                    System.out.print(firstElement / secondElement + "\n");
                    break;
                default:
                    System.out.print("Указан недопустимый оператор: " + array[1] + "\n");
            }
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0 запрещено");
        } catch (NumberFormatException ex) {
            System.out.println("Использован неверный формат ввода значений: " + task);
        }
    }

}
