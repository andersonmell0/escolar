package br.gov.ba.pm.escolar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.gov.ba.pm.escolar.model.Aluno;
import br.gov.ba.pm.escolar.repository.AlunoRepository;

@Controller
public class AlunoController {
	
	@Autowired
	private AlunoRepository alunos;
	
	//Mapeamento da pagina insertAluno
	@RequestMapping(value="/insertAluno", method=RequestMethod.GET)
	public String form() {
		return "aluno/insertAluno";
	}
	
	@RequestMapping(value="/insertAluno", method=RequestMethod.POST)
	public String form(Aluno aluno) {
		alunos.save(aluno);
		return "redirect:/insertAluno";
	}
	
	//Mapeamento da pagina listAluno
	@RequestMapping(value="listAluno", method=RequestMethod.GET)
	public ModelAndView listarAluno() {
		ModelAndView mv= new ModelAndView("aluno/listAluno");
		mv.addObject("alunos", alunos.findAll());
		mv.addObject("aluno", new Aluno());
		return mv;
	}
	

}
