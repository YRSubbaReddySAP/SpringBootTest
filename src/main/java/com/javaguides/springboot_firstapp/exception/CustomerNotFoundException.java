package com.javaguides.springboot_firstapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class CustomerNotFoundException  extends  RuntimeException{

    public CustomerNotFoundException(String message)
    {
        super(message);
    }
}
