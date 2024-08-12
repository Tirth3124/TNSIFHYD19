package com.si.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.si.demo.entity.Malladmin;

@Repository
public interface MalladminRepository extends JpaRepository<Malladmin, Long>{

}
