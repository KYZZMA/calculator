package ru.program.service;

import java.io.File;

public class Demo {
    File file1 = new File("tasks.txt");
    File file2 = new File("emptyFile.txt");
    File file3 = new File("notExistFile.txt");

    public void readFile() {
        CheckFile checkFile = new CheckFile();

        try {
            System.out.println("===Файл с задачами===");
            checkFile.checkNewFile(file1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println();
        }

        try {
            System.out.println("===Пустой файл===");
            checkFile.checkNewFile(file2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println();
        }

        try {
            System.out.println("===Несуществующий файл===");
            checkFile.checkNewFile(file3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println();
        }


    }
}
