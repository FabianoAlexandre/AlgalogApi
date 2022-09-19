package com.algaworks.algalog.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;
import com.algaworks.algalog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class clienteController {
	
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	@GetMapping("/clientes/nome")
	public List<Cliente> lista(){
		return clienteRepository.findByNome("Fabiano");
	}
	@GetMapping("/clientes/containing")
	public List<Cliente> list(){
		return clienteRepository.findByNomeContaining("Ru");
	}
}
