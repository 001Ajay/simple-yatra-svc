package com.adas.simple_yatra_svc.controller;

import com.adas.simple_yatra_svc.dto.RequesterDto;
import com.adas.simple_yatra_svc.service.RequesterService;
import io.micrometer.common.util.StringUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/requesters")
public class RequesterController {

    private RequesterService requesterService;

    @GetMapping("/hello")
    public String greetings() {
        return "Welcome to RequesterController apis";
    }

    @GetMapping
    public ResponseEntity<List<RequesterDto>> getAllRequesters(
            @RequestParam(required = false) String email) {
        log.debug("GET /requesters?email={} --->", email);
        if(!StringUtils.isEmpty(email)){
            return ResponseEntity.ok(requesterService.getAllRequestersByEmail(email));
        }
        return ResponseEntity.ok(requesterService.getAllRequesters());
    }

    @GetMapping("/{requesterId}")
    public ResponseEntity<RequesterDto> getRequesterById(@PathVariable Long requesterId){
        log.debug("GET /requesters/{} --->", requesterId);
        return requesterService
                .findById(requesterId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.noContent().build());
    }

    @PostMapping
    public ResponseEntity<RequesterDto> createRequester(@RequestBody RequesterDto dto){
        log.debug("POST /requesters --->");
        return ResponseEntity.ok(requesterService.save(dto));
    }

    @PutMapping("/{requesterId}")
    public ResponseEntity<RequesterDto> editRequester(@PathVariable Long requesterId, @RequestBody RequesterDto dto){
        log.debug("PUT /requesters/{} --->", requesterId);
        return ResponseEntity.ok(requesterService.update(requesterId, dto));
    }

    @DeleteMapping("/{requesterId}")
    public ResponseEntity<String> editRequester(@PathVariable Long requesterId){
        log.debug("DELETE /requesters/{} --->", requesterId);
        requesterService.remove(requesterId);
        return ResponseEntity.ok("Deleted successfully");
    }
}
