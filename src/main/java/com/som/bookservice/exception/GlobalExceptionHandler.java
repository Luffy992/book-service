package com.som.bookservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(
            MethodArgumentNotValidException.class
    )
    @ResponseStatus(
            HttpStatus.BAD_REQUEST
    )
    public String handleValidation(
            MethodArgumentNotValidException ex) {

        return ex.getBindingResult()
                .getFieldError()
                .getDefaultMessage();
    }
}