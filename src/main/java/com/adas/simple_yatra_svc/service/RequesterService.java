package com.adas.simple_yatra_svc.service;

import com.adas.simple_yatra_svc.dto.RequesterDto;

import java.util.List;

public interface RequesterService {
    List<RequesterDto> getAllRequesters();

    RequesterDto save(RequesterDto dto);
}
