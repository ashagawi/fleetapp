package com.kindsonthegenius.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kindsonthegenius.fleetapp.models.State;


public interface StateRepository extends JpaRepository<State, Integer> {

}
