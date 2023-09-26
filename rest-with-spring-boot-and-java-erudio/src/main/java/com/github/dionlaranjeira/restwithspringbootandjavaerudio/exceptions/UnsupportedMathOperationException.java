package com.github.dionlaranjeira.restwithspringbootandjavaerudio.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperationException extends  RuntimeException{
    private static final long serialVersionUID = 1l;

    public UnsupportedMathOperationException(String message) {
        super(message);
    }
}
