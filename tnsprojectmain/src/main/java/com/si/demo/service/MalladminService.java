package com.si.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.si.demo.entity.Malladmin;

@Service
public interface MalladminService {

	Malladmin saveMalladmin(Malladmin malladmin);

	List<Malladmin> fetchMalladminList();

	Malladmin fetchMalladminById(Long malladminId);

	void deleteMalladminById(Long malladminId);

	Malladmin updateMalladmin(Long malladminId, Malladmin malladmin);



}
