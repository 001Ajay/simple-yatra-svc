package com.adas.simple_yatra_svc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Exception handler for RequesterException
    @ExceptionHandler(RequesterException.class)
    public ResponseEntity<ExceptionDetails> userExceptionHandler(RequesterException de, WebRequest web) {
        ExceptionDetails err = new ExceptionDetails();
        err.setMessage(de.getMessage());
        err.setTimeStamp(LocalDateTime.now());
        err.setDescription(web.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }

    // Exception handler for general exceptions
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionDetails> generalExceptionHandler(Exception ex, WebRequest req) {
        ExceptionDetails err = new ExceptionDetails();
        err.setTimeStamp(LocalDateTime.now());
        err.setMessage(ex.getLocalizedMessage());
        err.setDescription(req.getDescription(false));
        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
