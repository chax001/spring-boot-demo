package com.ritesh.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritesh.conferenceapp.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long> {

}
