package com.autobots.automanager.controles;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.autobots.automanager.entidades.Cliente;
import com.autobots.automanager.entidades.Documento;
import com.autobots.automanager.repositorios.ClienteRepositorio;
import com.autobots.automanager.repositorios.DocumentoRepositorio;

@RestController
public class DocumentoControle {

	@Autowired
	private ClienteRepositorio repositorioCliente;
	
	@Autowired
	private DocumentoRepositorio repositorio;
	
	@GetMapping("/documentos")
	public List<Documento>obterDocumentos(){
		return repositorio.findAll();
	}
	@GetMapping("/documento/{id}")
	public Documento obterDocumentoID(@PathVariable long id){
		return repositorio.findById(id).get();
	}
	@PutMapping("/atualizarDocumento")
	private void atualizarDocumento (@RequestBody Cliente atualizacao) {
		Cliente cliente = repositorioCliente.getById(atualizacao.getId());
		cliente.getDocumentos().addAll(atualizacao.getDocumentos());
		repositorioCliente.save(cliente);
	}
	@DeleteMapping("/deletarDocumentos")
	public void excluirDocumento(@RequestBody Cliente excluir) {
		Cliente cliente = repositorioCliente.getById(excluir.getId());
		cliente.getDocumentos().clear();
		repositorioCliente.save(cliente);
	}
	
	
	
	
}
