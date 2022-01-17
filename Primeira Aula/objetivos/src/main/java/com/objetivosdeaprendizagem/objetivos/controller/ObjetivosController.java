package com.objetivosdeaprendizagem.objetivos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")

public class ObjetivosController {
	@GetMapping
	public String objetivosAprendizagem() {
		return "1º Aprender Spring\n2º Saber como usar o Spring no projeto integrador do meu grupo"
				+ "\n3º Realizar todos os exercícios propostos\n4º Ajudar meus colegas, caso eles"
				+ " precisem\n5º Terminar essa semana sabendo mais do que a anterior, crescendo a cada dia!";
	}
}
