package com.ritesh.conferenceapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ritesh.conferenceapp.models.Speaker;


public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

	}
