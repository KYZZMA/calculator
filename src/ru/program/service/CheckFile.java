package ru.program.service;

import ru.program.exception.FileEmptyException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckFile {

    public void checkNewFile(File file) throws FileNotFoundException {
        Calculation calculation = new Calculation();

        if (file.length() == 0 && file.exists()) {
            throw new FileEmptyException("Передаваемый файл пуст");
        }

        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            calculation.calculationExample(scanner.nextLine());
        }
        scanner.close();

    }
}
