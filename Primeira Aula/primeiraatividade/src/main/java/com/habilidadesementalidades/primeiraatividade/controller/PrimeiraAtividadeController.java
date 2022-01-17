package com.habilidadesementalidades.primeiraatividade.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraatividade")

public class PrimeiraAtividadeController {

	@GetMapping
	public String habilidadesMentalidades() {
		return "Persistência\nAdaptabilidade\nProatividade\nResponsabilidade Pessoal"
				+ "\nMentalidade de Crescimento";
	}
	
	
}
