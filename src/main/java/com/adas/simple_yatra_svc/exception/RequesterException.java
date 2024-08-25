package com.adas.simple_yatra_svc.exception;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class RequesterException extends RuntimeException{

    public RequesterException(String errorMessage){
        super(errorMessage);
    }
}
