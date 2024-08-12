package com.si.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.si.demo.entity.Malladmin;
import com.si.demo.service.MalladminService;

@RestController
public class MalladminController {
@Autowired
MalladminService malladminService;

@PostMapping("/malladmin")
public Malladmin saveMalladmin(@RequestBody Malladmin malladmin) {
	return malladminService.saveMalladmin(malladmin);
}
@GetMapping("/malladmin")
public List<Malladmin>fetchMalladminList(){
	return malladminService.fetchMalladminList();
}
@GetMapping("/malladmin/{id}")
public Malladmin fetchMalladminById(@PathVariable("id") Long malladminId ) {
	return malladminService.fetchMalladminById(malladminId);
}
@DeleteMapping("/malladmin/{id}")
public String deleteMalladminById(@PathVariable("id") Long malladminId) {
	malladminService.deleteMalladminById(malladminId);
	return "malladmin deleted successfully";
}
@PutMapping("/malladmin/{id}")
public Malladmin updateMalladmin(@PathVariable("id") Long malladminId, @RequestBody Malladmin malladmin) {
	return malladminService.updateMalladmin(malladminId,malladmin);
}
}
