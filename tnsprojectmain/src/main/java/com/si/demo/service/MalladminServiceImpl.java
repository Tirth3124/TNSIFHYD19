package com.si.demo.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.si.demo.entity.Malladmin;
import com.si.demo.repository.MalladminRepository;

@Service
public class MalladminServiceImpl implements MalladminService{
@Autowired
MalladminRepository malladminRepository;

@Override
public Malladmin saveMalladmin(Malladmin malladmin) {
	// TODO Auto-generated method stub
	return malladminRepository.save(malladmin);
}

@Override
public List<Malladmin> fetchMalladminList() {
	// TODO Auto-generated method stub
	return malladminRepository.findAll();
}

@Override
public Malladmin fetchMalladminById(Long malladminId) {
	// TODO Auto-generated method stub
	return malladminRepository.findById(malladminId).get();
}

@Override
public void deleteMalladminById(Long malladminId) {
	// TODO Auto-generated method stub
	malladminRepository.deleteById(malladminId);
}

@Override
public Malladmin updateMalladmin(Long malladminId, Malladmin malladmin) {
	Malladmin malladminDB = malladminRepository.findById(malladminId).get();
	if(Objects.nonNull(malladmin.getName()) &&
			!"".equalsIgnoreCase(malladmin.getName())){
		malladminDB.setName(malladmin.getName());
	}
	if(Objects.nonNull(malladmin.getPassword()) && 
			!"".equalsIgnoreCase(malladmin.getPassword())) {
		malladminDB.setPassword(malladmin.getPassword());
	}
	// TODO Auto-generated method stub
	return malladminRepository.save(malladminDB);
}
}
