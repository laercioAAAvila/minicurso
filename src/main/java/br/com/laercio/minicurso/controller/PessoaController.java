package br.com.laercio.minicurso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.laercio.minicurso.model.PessoaModel;
import br.com.laercio.minicurso.service.PessoaService;

@Controller
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;
		
	@RequestMapping(method = RequestMethod.GET, value = "/")
	public String index(Model model) {
		
		List<PessoaModel> listaDePessoas = pessoaService.listarPessoa();
		model.addAttribute("listaDePessoas", listaDePessoas);
		return "index";
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/cadastrar")
	public String cadastrar(@ModelAttribute PessoaModel pessoa) {
		this.pessoaService.salvarPessoa(pessoa);
		return "redirect:/";
	}
	
}
