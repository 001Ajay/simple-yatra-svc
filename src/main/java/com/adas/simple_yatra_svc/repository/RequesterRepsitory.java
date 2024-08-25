package com.adas.simple_yatra_svc.repository;

import com.adas.simple_yatra_svc.entity.Requester;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RequesterRepsitory extends JpaRepository<Requester, Long> {

    Optional<Requester> findByEmail(String email);

}
