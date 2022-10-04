package com.formation.velo.repository;

import com.formation.velo.model.Station;
import com.formation.velo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StationRepository extends JpaRepository<Station, Integer> {

}