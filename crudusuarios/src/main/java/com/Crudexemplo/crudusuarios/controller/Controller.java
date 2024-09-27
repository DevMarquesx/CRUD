package com.Crudexemplo.crudusuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Crudexemplo.crudusuarios.UsuarioDTO;
import com.Crudexemplo.crudusuarios.model.UsuarioModel;
import com.Crudexemplo.crudusuarios.repository.UserRepository;

@RestController
@RequestMapping("user")
public class Controller {

	@Autowired
	UserRepository repository;
	
	@GetMapping
	public List<UsuarioModel> listarUsuarios () {
	List<UsuarioModel> lista = repository.findAll();
	return lista;
	}
	
	@PostMapping
	public void salvarUsuario(@RequestBody UsuarioDTO dados) {
		UsuarioModel userdata = new UsuarioModel(dados);
		repository.save(userdata);
	}
}
