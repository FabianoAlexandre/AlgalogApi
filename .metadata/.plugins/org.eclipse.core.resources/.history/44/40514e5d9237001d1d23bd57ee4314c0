package com.algaworks.algalog.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.algalog.domain.model.Cliente;

@RestController
//@RequestMapping(value = "/clientes")
public class clienteController {
	
	@GetMapping("/clientes")
	public List<Cliente> listar(){
		var cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setName("Fabiano Alexandre");
		cliente1.setPhone("5845-5698");
		cliente1.setEmail("fabiano@gamail.com");
		var cliente2 = new Cliente();
		cliente2.setId(1L);
		cliente2.setName("Ruan");
		cliente2.setPhone("5845-5698");
		cliente2.setEmail("ruan@gamail.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
	
//	@GetMapping
//	public String listar() {
//		return "Testando";
//	}
//	@GetMapping("/test")
//	public String testar() {
//		return "Testando caminho teste";
//	}
}
