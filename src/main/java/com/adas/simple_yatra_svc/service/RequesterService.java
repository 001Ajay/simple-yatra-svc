package com.adas.simple_yatra_svc.service;

import com.adas.simple_yatra_svc.dto.RequesterDto;

import java.util.List;
import java.util.Optional;

public interface RequesterService {

    List<RequesterDto> getAllRequesters();

    Optional<RequesterDto> findById(Long requesterId);

    RequesterDto save(RequesterDto dto);

    RequesterDto update(Long requesterId, RequesterDto dto);

    void remove(Long requesterId);

    List<RequesterDto> getAllRequestersByEmail(String email);
}
