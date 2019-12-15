package com.darshan.errorgenerator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class Controller {

    @GetMapping("/")
    public List<Error> getError() {
        List<Error> errors = new ArrayList<>();
        Random rand = new Random();
        int number = rand.nextInt(10);
        for (int index = 0; index < number; index++) {
            errors.add(getErrorMessage());
        }
        return errors;
    }

    public Error getErrorMessage() {
        Map<String, String> errors= new HashMap<>();
        errors.put("ERR-101", "ArrayIndexOutOfBoundsException");
        errors.put("ERR-102", "NullPointerException");
        errors.put("ERR-103", "OutOfMemoryError");
        errors.put("ERR-104", "StringIndexOutOfBoundsException");
        errors.put("ERR-105", "StackOverflowError");

        List<String> keysAsArray = new ArrayList<>(errors.keySet());
        Random rand = new Random();
        int keyIndex = rand.nextInt(keysAsArray.size());
        String errorDescription = errors.get(keysAsArray.get(keyIndex));
        Error error = new Error(keysAsArray.get(keyIndex), errorDescription, new Date());
        return error;
    }
}
