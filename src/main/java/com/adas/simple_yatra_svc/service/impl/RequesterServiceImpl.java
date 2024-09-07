package com.adas.simple_yatra_svc.service.impl;

import com.adas.simple_yatra_svc.dto.RequesterDto;
import com.adas.simple_yatra_svc.mapper.ModelMapper;
import com.adas.simple_yatra_svc.entity.Requester;
import com.adas.simple_yatra_svc.repository.RequesterRepsitory;
import com.adas.simple_yatra_svc.service.RequesterService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class RequesterServiceImpl implements RequesterService {

    private RequesterRepsitory repository;
    private ModelMapper mapper;

    @Override
    public List<RequesterDto> getAllRequesters() {
        log.debug("Getting requesters");
        return repository
                .findAll().stream()
                .map(mapper::entityToDto)
                .toList();
    }

    @Override
    public RequesterDto save(RequesterDto dto) {
        Requester entity = mapper.dtoToEntity(dto);
        entity = repository.save(entity);
        return mapper.entityToDto(entity);
    }
}
