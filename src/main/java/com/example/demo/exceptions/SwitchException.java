package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
public class SwitchException extends RuntimeException {

    SwitchException(String msg) {
        super(msg);
    }
}
