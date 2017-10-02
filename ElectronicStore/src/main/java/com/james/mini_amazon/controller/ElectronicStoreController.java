package com.james.mini_amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.james.mini_amazon.modal.Electronic;
import com.james.mini_amazon.service.ElectronicStoreService;

@RestController
public class ElectronicStoreController {
	
	@Value("${health.check.word}")
	private String healthCheckWord;
	
	@Autowired
	private ElectronicStoreService electronicService;
	
	@RequestMapping("/")
	public List<Electronic> getAllBooks() {
		return electronicService.getAllElectronics();
	}
	
	@RequestMapping("/{id}")
	public Electronic getBookById(@PathVariable("id") Long id) {
		return electronicService.getElectronicById(id);
	}
	
	@RequestMapping("/health-check")
	public String health() {
		return this.healthCheckWord;
	}
}
