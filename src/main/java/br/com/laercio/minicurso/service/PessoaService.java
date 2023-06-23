package br.com.laercio.minicurso.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.laercio.minicurso.model.PessoaModel;
import br.com.laercio.minicurso.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	public List<PessoaModel> listarPessoa (){
		return this.pessoaRepository.findAll();
	}
	
	public void salvarPessoa (PessoaModel pessoa) {
		this.pessoaRepository.save(pessoa);
	}
}
