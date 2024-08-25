package com.adas.simple_yatra_svc.exception;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Data
public class ExceptionDetails {

    private LocalDateTime timeStamp;
    private String message;
    private String description;
}
