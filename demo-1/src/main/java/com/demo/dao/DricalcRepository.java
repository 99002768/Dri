package com.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.model.Dricalc;

@Repository
public interface DricalcRepository extends JpaRepository<Dricalc,Integer>{

}
