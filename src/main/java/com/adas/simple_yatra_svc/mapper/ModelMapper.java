package com.adas.simple_yatra_svc.mapper;

import com.adas.simple_yatra_svc.dto.RequesterDto;
import com.adas.simple_yatra_svc.entity.Requester;
import org.mapstruct.Mapper;

@Mapper
public interface ModelMapper {
    Requester dtoToEntity(RequesterDto dto);
    RequesterDto entityToDto(Requester entity);
}
