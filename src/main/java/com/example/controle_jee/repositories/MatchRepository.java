package com.example.controle_jee.repositories;

import com.example.controle_jee.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatchRepository extends JpaRepository<Match,Long> {
}
