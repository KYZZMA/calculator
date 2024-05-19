package ru.program.exception;

import java.io.FileNotFoundException;

public class FileEmptyException extends FileNotFoundException {
    public FileEmptyException(String message){
        super(message);
    }
}
