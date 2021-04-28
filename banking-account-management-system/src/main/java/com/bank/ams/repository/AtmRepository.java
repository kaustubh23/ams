package com.bank.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.ams.model.Atm;

@Repository
public interface AtmRepository extends JpaRepository<Atm, Integer> {

}
