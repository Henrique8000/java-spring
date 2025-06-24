package com.example.apitestetmeter.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping(path = "/msg")
	public ResponseEntity<String> exibeMsg() {
		return ResponseEntity.ok("API spring boot teste Jmeter do Henrique 🍃🍃🍃👾👾👾🔥🔥🔥");
		
	}
	
	@GetMapping(path = "/soma")
	public ResponseEntity<Integer> exibeSoma() {
		return ResponseEntity.ok(2 + 2);
	}
	
	@PostMapping
	public ResponseEntity<String> coisaACoisa() {
		return ResponseEntity.ok("coisando a coisa");
	}
}
