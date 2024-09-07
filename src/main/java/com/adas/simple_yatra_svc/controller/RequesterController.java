package com.adas.simple_yatra_svc.controller;

import com.adas.simple_yatra_svc.dto.RequesterDto;
import com.adas.simple_yatra_svc.service.RequesterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
public class RequesterController {

    private RequesterService requesterService;

    @GetMapping("/requester/hello")
    public String greetings() {
        return "Welcome to RequesterController apis";
    }

    @GetMapping("/requesters")
    public ResponseEntity<List<RequesterDto>> getAllRequesters() {
        log.debug("GET /requesters --->");
        return ResponseEntity.ok(requesterService.getAllRequesters());
    }

    @PostMapping("/requester")
    public ResponseEntity<RequesterDto> createRequester(@RequestBody RequesterDto dto){
        log.debug("POST /requester --->");
        return ResponseEntity.ok(requesterService.save(dto));
    }
}
